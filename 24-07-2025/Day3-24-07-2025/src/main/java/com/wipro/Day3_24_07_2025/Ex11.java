package com.wipro.Day3_24_07_2025;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth date (yyyy-mm-dd):");
        String birthDateStr = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateStr);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);
        System.out.println("Your age is: " + age.getYears() + " years.");

        sc.close();
    }
}

