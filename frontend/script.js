function analyzeFile() {

    let file =
        document.getElementById("javaFile").files[0];

    if (!file) {
        alert("Please select a Java file.");
        return;
    }

    alert("File Uploaded Successfully!");

    window.location.href = "report.html";
}