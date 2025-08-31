var Stack = /** @class */ (function () {
    function Stack() {
        this.input = [];
    }
    Stack.prototype.push = function (input) {
        this.input.push(input);
    };
    Stack.prototype.pop = function () {
        return this.input.pop();
    };
    Stack.prototype.peek = function () {
        return this.input[this.input.length - 1];
    };
    return Stack;
}());
var number = new Stack();
number.push(23);
number.push(4);
number.push(22);
console.log("Peek:", number.peek());
console.log("Pop:", number.pop());
console.log("Peek after pop:", number.peek());
var str = new Stack();
str.push("Memanasa");
str.push("Sneha");
console.log("Peek:", str.peek());
console.log("Pop:", str.pop());
console.log("Peek after pop:", str.peek());
