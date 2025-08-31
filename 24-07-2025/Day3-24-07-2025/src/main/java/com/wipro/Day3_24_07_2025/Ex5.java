package com.wipro.Day3_24_07_2025;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ex5 {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List: " + numbers);

        
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        
        List<Integer> noDuplicateList = new ArrayList<>(uniqueNumbers);

        System.out.println("List after removing duplicates: " + noDuplicateList);
    }
}

