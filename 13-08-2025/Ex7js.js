let persons = [
    { name: "Memanasa", age: 23, city: "Hyderabad" },
    { name: "Shivani", age: 25, city: "Chennai" },
    { name: "Disha", age: 28, city: "Jaipur" },
    { name: "Sneha", age: 16, city: "Hyderabad" }
];

let eligibleVoters = persons.filter(a => a.age >= 18);

console.log(eligibleVoters);
