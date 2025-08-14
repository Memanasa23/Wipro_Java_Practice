function str(a, ...arg) {
    return { a, arg };
}

console.log(str(1, 2, 3, 4));
console.log(str('Memanasa'));
console.log(str());