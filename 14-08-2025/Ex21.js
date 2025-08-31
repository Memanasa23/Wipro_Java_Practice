var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var box1 = new Box("Jaiswal Memanasa");
console.log("String value:", box1.getValue());
var box2 = new Box(76);
console.log("Number value:", box2.getValue());
