package com.wipro.Day3_24_07_2025;

import java.util.Scanner;
import java.time.Year;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        boolean isLeap = Year.isLeap(year);

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }

        sc.close();
    }
}

