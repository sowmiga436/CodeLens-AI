package com.codelens.backend.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.codelens.backend.service.GroqService;

@Controller
public class UploadController {
                     

private final GroqService groqService;

public UploadController(GroqService groqService) {
    this.groqService = groqService;
}

    private final String UPLOAD_DIR = "uploads/";

    @PostMapping("/api/upload")
public String uploadFile(@RequestParam("file") MultipartFile file,
                         Model model){
         

    try {

        if (file.isEmpty()) {
            return "No file selected!";
        }

        Files.createDirectories(Paths.get(UPLOAD_DIR));

       Path path = Paths.get(
        UPLOAD_DIR + file.getOriginalFilename());

Files.write(path, file.getBytes());

String content = Files.readString(path);
String aiSuggestion =
        groqService.analyzeCode(content);
long lines = Files.lines(path).count();
long methods = content.lines()
        .filter(line ->
                line.contains("(")
                && line.contains(")")
                && line.contains("{"))
        .count();
        long classes = content.lines()
        .filter(line -> line.contains("class "))
        .count();
       long complexity = content.lines()
        .filter(line ->
                line.contains("if")
                || line.contains("for")
                || line.contains("while")
                || line.contains("switch"))
        .count();
String suggestion = "";
int score = 100;

score -= (int) (complexity * 2);
score -= (int) methods;
score -= (int) (lines / 20);

if (score < 0) {
    
    score = 0;
}
String grade;

if (score >= 90) {
    grade = "A";
} else if (score >= 75) {
    grade = "B";
} else if (score >= 60) {
    grade = "C";
} else {
    grade = "D";
}
long comments = content.lines()
        .filter(line ->
                line.trim().startsWith("//")
                || line.trim().startsWith("/*")
                || line.trim().startsWith("*"))
        .count();

long emptyLines = content.lines()
        .filter(line -> line.trim().isEmpty())
        .count();
        String longMethodWarning = "";

if (lines > 50) {
    longMethodWarning =
            "⚠ File is too long. Consider splitting into smaller classes.\n";
}
if (content.contains("int a")
        || content.contains("int x")
        || content.contains("int y")) {
    suggestion +=
            "⚠ Use meaningful variable names instead of a, x, y.\n";
}

if (complexity > 10) {
    suggestion += "⚠ High complexity. Consider reducing nested loops.\n";
    
    
}

if (methods > 10) {
    suggestion += "⚠ Too many methods. Consider splitting classes.\n";
}

if (lines > 200) {
    suggestion += "⚠ Large file. Consider refactoring.\n";
}

model.addAttribute("lines", lines);
model.addAttribute("classes", classes);
model.addAttribute("methods", methods);
model.addAttribute("comments", comments);
model.addAttribute("emptyLines", emptyLines);
model.addAttribute("complexity", complexity);
model.addAttribute("score", score);
model.addAttribute("suggestion", suggestion + longMethodWarning);
model.addAttribute("content", content);
model.addAttribute("grade", grade);
model.addAttribute("aiSuggestion", aiSuggestion);

return "report";


    } catch (Exception e) {
        return "Error : " + e.getMessage();
    }
}
}