class Calculator {
  add(a: number, b: number): number {
    return a + b;
  }

  sub(a: number, b: number): number {
    return a - b;
  }
}

const cal = new Calculator();

console.log(cal.add(78, 18));       
console.log(cal.sub(40, 20)); 
