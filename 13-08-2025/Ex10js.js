let persons = [
    { name: "Memanasa", age: 23, city: "Hyderabad" },
    { name: "Sneha", age: 17, city: "Chennai" },
    { name: "Simpi", age: 28, city: "Jaipur" },
    { name: "Mayank", age: 16, city: "Hyderabad" },
];

let result = [];

persons.forEach(person => {
    result.push({
        name: person.name,
        age: person.age,
        city: person.city,
        status: person.age >= 18 ? "Adult" : "Minor"});
});

console.log(result);
