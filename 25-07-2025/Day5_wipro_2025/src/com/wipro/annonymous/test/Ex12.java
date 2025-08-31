package com.wipro.annonymous.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex12 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayanta", "Amit", "Jnanedra", "Raja", "Ajay", "Anjali", "Jagan");

        
        List<String> output = names.stream()
                .filter(s -> s.contains("Ja"))
                .collect(Collectors.toList());

        System.out.println(output);

	}

}
