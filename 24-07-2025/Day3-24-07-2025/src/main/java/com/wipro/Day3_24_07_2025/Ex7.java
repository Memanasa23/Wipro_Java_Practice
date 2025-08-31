package com.wipro.Day3_24_07_2025;

import java.util.*;

class Employee {
    private String empId;
    private String empName;
    private int empAge;
    double empSalary;

    public Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - Age: " + empAge + " - Salary: " + empSalary;
    }
}

public class Ex7 { 
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("E001", "Sneha", 21, 45000));
        employees.add(new Employee("E002", "Manasa", 25, 55000));
        employees.add(new Employee("E003", "Rahul", 30, 35000));
        employees.add(new Employee("E004", "Priya", 28, 60000));

        
        employees.sort((e1, e2) -> Double.compare(e2.getEmpSalary(), e1.getEmpSalary()));

        
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

