package com.wiproA;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

class Emp {
    String name;
    int age;
    double salary;

 
    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class Ex6 {
    public static void main(String[] args) {
        List<Emp> employees = Arrays.asList(
                new Emp("Memanasa", 23, 50000),
                new Emp("Sneha", 21, 30000),
                new Emp("Simpi", 35, 65000),
                new Emp("Manish", 28, 80000),
                new Emp("Pratima", 38, 55000)
        );

        OptionalDouble avgSalary = employees.stream()
                .filter(e -> e.getAge() > 30 && e.getSalary() > 50000)
                .mapToDouble(Emp::getSalary)
                .average();
        
        System.out.println(avgSalary.getAsDouble());
        
    }
}


