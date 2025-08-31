interface Employee {
  empId: number;
  empName: string;
  salary: number;
}

const emp: Employee[] = [
  { empId: 101, empName: "Memanasa", salary: 55000 },
  { empId: 102, empName: "Sneha", salary: 62000 },
  { empId: 103, empName: "Simpi", salary: 58000 },
];

function solution(list: Employee[]): number {
  list.forEach(e => {
    console.log(`ID: ${e.empId}, Name: ${e.empName}, Salary: ${e.salary}`);
  });

  return list.length;
}

const count = solution(emp);
console.log("Count of employees:", count);
