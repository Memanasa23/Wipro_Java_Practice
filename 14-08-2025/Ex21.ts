class Box<T> {
    value: T;

    constructor(value: T) {
        this.value = value;
    }

    getValue(): T {
        return this.value;
    }
}


const box1 = new Box<string>("Jaiswal Memanasa");
console.log("String value:", box1.getValue());

const box2 = new Box<number>(76);
console.log("Number value:", box2.getValue());
