var emp = [
    { empId: 101, empName: "Memanasa", salary: 55000 },
    { empId: 102, empName: "Sneha", salary: 62000 },
    { empId: 103, empName: "Simpi", salary: 58000 },
];
function solution(list) {
    list.forEach(function (e) {
        console.log("ID: ".concat(e.empId, ", Name: ").concat(e.empName, ", Salary: ").concat(e.salary));
    });
    return list.length;
}
var count = solution(emp);
console.log("Count of employees:", count);
