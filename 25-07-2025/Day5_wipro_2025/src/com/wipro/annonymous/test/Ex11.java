package com.wipro.annonymous.test;

import java.util.*;

class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Ex11 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
	            new Employee(103, "Amit", 55000),
	            new Employee(101, "Jayanta", 75000),
	            new Employee(102, "Vasu", 65000)
	        );

	        Collections.sort(employees, Comparator.comparingInt(emp -> emp.id));

	        employees.forEach(System.out::println);
	    
	}

}


