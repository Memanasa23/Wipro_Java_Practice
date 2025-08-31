const userIdInput = document.getElementById("userId");
const passwordInput = document.getElementById("password");
const statusText = document.getElementById("status");

document.getElementById("loginBtn").addEventListener("click", () => {
    const userId = userIdInput.value.trim();
    const password = passwordInput.value.trim();

    if (userId && password) {
        localStorage.setItem("userId", userId);
        statusText.textContent = `Logged in as ${userId}`;
    } else {
        statusText.textContent = "Please enter both User ID and Password.";
    }
});

document.getElementById("logoutBtn").addEventListener("click", () => {
    if (localStorage.getItem("userId")) {
        localStorage.removeItem("userId");
        statusText.textContent = "Logged out successfully.";
    } else {
        statusText.textContent = "No user is currently logged in.";
    }
});
