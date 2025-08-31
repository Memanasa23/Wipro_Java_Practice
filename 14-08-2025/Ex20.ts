function pair<T, U>(x: T, y: U): [T, U] {
    return [x, y];
}

const input1 = pair<number, string>(42, "Hello");
console.log(input1);

const input2 = pair<boolean, { name: string }>(true, { name: "Memanasa" });
console.log(input2);
