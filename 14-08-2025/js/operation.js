export function multiply(a, b) {
    return a * b;
}

export function divide(a, b) {
    if (b === 0) {
        return "Error: Cannot Divided by Zero";
    }
    return a / b;
}