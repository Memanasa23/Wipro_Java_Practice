let t = document.getElementById("a");
let ch = document.getElementById("c");

t.addEventListener("input", function () {
    let rem = 50 - t.value.length;
    ch.innerText = `${rem} characters remaining`;
});
