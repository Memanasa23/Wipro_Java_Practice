package com.wipro.Day3_24_07_2025;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original list: " + numbers);

        
        numbers.remove(2);
        System.out.println("After removing index 2: " + numbers);

        
        numbers.add(99);
        System.out.println("After adding new element at end: " + numbers);
    }
}
