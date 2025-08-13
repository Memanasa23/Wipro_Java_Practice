let persons = [
    { name: "Memanasa", age: 23, city: "Hyderabad" },
    { name: "Sneha", age: 17, city: "Chennai" },
    { name: "Simpi", age: 28, city: "Jaipur" },
    { name: "Mayank", age: 16, city: "Hyderabad" },
];

for (let i = 0; i < persons.length; i++) {
    if (persons[i].age >= 18) {
        persons[i].status = "Adult";
    } else {
        persons[i].status = "Minor";
    }
}

console.log(persons);
