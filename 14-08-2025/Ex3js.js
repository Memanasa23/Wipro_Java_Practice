class Util {

    getDate() {
        let today = new Date();
        let dd = String(today.getDate());
        let mm = String(today.getMonth() + 1);
        let yyyy = today.getFullYear();
        return `${dd}-${mm}-${yyyy}`;
    }

    getPIValue() {
        return Math.PI;
    }

    convertC2F(celsius) {
        return (celsius * 9/5) + 32;
    }

    getFibonacci(n) {
        let fib = [0, 1];
        for (let i = 2; i < n; i++) {
            fib.push(fib[i-1] + fib[i-2]);
        }
        return fib;
    }
}

let util = new Util();

console.log("Date: ", util.getDate());
console.log("PI: ", util.getPIValue());
console.log("Fahrenheit: ", util.convertC2F(45) + "°F");
console.log("Fibonacci: ", util.getFibonacci(3));
