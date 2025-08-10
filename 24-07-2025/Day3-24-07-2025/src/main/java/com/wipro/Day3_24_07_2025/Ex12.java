package com.wipro.Day3_24_07_2025;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first date (yyyy-mm-dd):");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.println("Enter the second date (yyyy-mm-dd):");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        Period diff = Period.between(date1, date2);

        System.out.println("Difference is:");
        System.out.println(diff.getYears() + " years, " + diff.getMonths() + " months, and " + diff.getDays() + " days.");

        sc.close();
    }
}

