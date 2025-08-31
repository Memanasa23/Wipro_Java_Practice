function numbers(...num) {
    return num.reduce((s, n) => s + n, 0);
}

console.log(numbers(7, 9, 11, 13));
console.log(numbers());