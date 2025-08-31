package com.wiproA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Memanasa", "Sneha", "Simpi", "Manish", "Pratima");

        
        List<String> sort_Name = names.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        sort_Name.forEach(System.out::println);
    }
}



