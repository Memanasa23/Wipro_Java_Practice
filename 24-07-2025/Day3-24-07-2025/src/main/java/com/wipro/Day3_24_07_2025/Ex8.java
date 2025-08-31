package com.wipro.Day3_24_07_2025;

import java.util.*;

class Employee {
 String empId;
 String empName;
 int empAge;
 double empSalary;

 public Employee(String empId, String empName, int empAge, double empSalary) {
     this.empId = empId;
     this.empName = empName;
     this.empAge = empAge;
     this.empSalary = empSalary;
 }

 @Override
 public String toString() {
     return empId + ", " + empName + ", " + empAge + ", " + empSalary;
 }
}

//Sort by empId
class SortByEmpId implements Comparator<Employee> {
 public int compare(Employee e1, Employee e2) {
     return e1.empId.compareTo(e2.empId);
 }
}

//Sort by empName
class SortByEmpName implements Comparator<Employee> {
 public int compare(Employee e1, Employee e2) {
     return e1.empName.compareTo(e2.empName);
 }
}

//Sort by empAge
class SortByEmpAge implements Comparator<Employee> {
 public int compare(Employee e1, Employee e2) {
     return Integer.compare(e1.empAge, e2.empAge);
 }
}

public class Ex8 {
 public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();

     employees.add(new Employee("E102", "Alice", 25, 75000));
     employees.add(new Employee("E101", "Bob", 30, 82000));
     employees.add(new Employee("E103", "Charlie", 28, 78000));

     System.out.println("Original List:");
     employees.forEach(System.out::println);

     Collections.sort(employees, new SortByEmpId());
     System.out.println("\nSorted by empId:");
     employees.forEach(System.out::println);

     Collections.sort(employees, new SortByEmpName());
     System.out.println("\nSorted by empName:");
     employees.forEach(System.out::println);

     Collections.sort(employees, new SortByEmpAge());
     System.out.println("\nSorted by empAge:");
     employees.forEach(System.out::println);
 }
}

