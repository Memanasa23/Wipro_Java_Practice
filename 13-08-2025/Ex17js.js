let questions = [
    {
        question: "What is the value of 65/13",
        options: ["6", "2", "9", "5"],
        answer: "5"
    },
    {
        question: "What is the value of 12 * 12",
        options: ["144", "196", "125", "256"],
        answer: "144"
    },
    {
        question: "What is the value of 5*2+6",
        options: ["10", "12", "16", "15"],
        answer: "16"
    }
];

let currentQuestionIndex = 0;
let score = 0;

function showQuestion() {
    let q = questions[currentQuestionIndex];
    document.getElementById("question").textContent = q.question;

    let optionsDiv = document.getElementById("options");
    optionsDiv.innerHTML = ""; 

    q.options.forEach(option => {
        let btn = document.createElement("button");
        btn.textContent = option;
        btn.onclick = () => checkAnswer(option);
        optionsDiv.appendChild(btn);
    });

    document.getElementById("feedback").textContent = "";
}

function checkAnswer(selectedOption) {
    let correctAnswer = questions[currentQuestionIndex].answer;
    let feedback = document.getElementById("feedback");

    if (selectedOption === correctAnswer) {
        feedback.textContent = "Correct!";
        score++;
    } else {
        feedback.textContent = "Wrong!";
    }
}

document.getElementById("nextBtn").addEventListener("click", () => {
    currentQuestionIndex++;
    if (currentQuestionIndex < questions.length) {
        showQuestion();
    } else {
        document.getElementById("question-container").innerHTML = `<h2>Quiz Over!</h2><p>Your final score: ${score}</p>`;
        document.getElementById("nextBtn").style.display = "none";
    }
});

showQuestion();

