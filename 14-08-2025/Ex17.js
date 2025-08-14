var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    Calculator.prototype.sub = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
var cal = new Calculator();
console.log(cal.add(78, 18));
console.log(cal.sub(40, 20));
