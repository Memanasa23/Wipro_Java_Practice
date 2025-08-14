function sum(a, b, c) {
    return a + b + c;
}
const numbers = [15, 21, 24];
const result = sum(...numbers);
console.log("Sum:", result);