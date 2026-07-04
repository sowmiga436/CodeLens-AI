// Login form validation
function validateLogin() {
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;

    if (email === "" || password === "") {
        alert("Please enter Email and Password");
        return false;
    }

    return true;
}

// File upload validation
function validateFile() {
    let file = document.getElementById("file").value;

    if (file === "") {
        alert("Please select a Java file.");
        return false;
    }

    if (!file.endsWith(".java")) {
        alert("Only .java files are allowed.");
        return false;
    }

    return true;
}

// Welcome message
window.onload = function () {
    console.log("CodeLens AI Loaded Successfully 🚀");
};