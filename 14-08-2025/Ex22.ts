class Stack<T> {
    private input: T[] = [];

    push(input: T): void {
        this.input.push(input);
    }

    pop(): T | undefined {
        return this.input.pop();
    }

    peek(): T | undefined {
        return this.input[this.input.length - 1];
    }
}

const number = new Stack<number>();

number.push(23);
number.push(4);
number.push(22);

console.log("Peek:", number.peek()); 
console.log("Pop:", number.pop());   
console.log("Peek after pop:", number.peek()); 

const str = new Stack<string>();
str.push("Memanasa");
str.push("Sneha");

console.log("Peek:", str.peek()); 
console.log("Pop:", str.pop());   
console.log("Peek after pop:", str.peek()); 
