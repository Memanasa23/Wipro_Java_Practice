package com.wipro.Day3_24_07_2025;

import java.util.concurrent.CopyOnWriteArrayList;

public class Ex9 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Employee> employees = new CopyOnWriteArrayList<>();

        employees.add(new Employee("E102", "Alice", 25, 75000));
        employees.add(new Employee("E101", "Bob", 30, 82000));
        employees.add(new Employee("E103", "Charlie", 28, 90000));
        employees.add(new Employee("E104", "David", 35, 70000));

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        for (Employee e : employees) {
            if (e.empSalary > 80000) {
                employees.remove(e);
            }
        }

        System.out.println("\nAfter removing employees earning more than 80000:");
        employees.forEach(System.out::println);
    }
}

