let num = [10, 20, 30, 40, 50];

let sumArray = (arr) => arr.reduce((t, n) => t + n, 0);

let total = sumArray(num);

console.log(total)