let employees = [
    { name: "Memanasa", role: "Manager", salary: 50000 },
    { name: "Sneha", role: "Manager", salary: 60000 },
    { name: "Simpi", role: "QA", salary: 30000 }
];

let total = employees
    .filter(emp => emp.role === "Manager") 
    .reduce((total, emp) => total + emp.salary, 0);

console.log("Total Salary of Managers:", total);
