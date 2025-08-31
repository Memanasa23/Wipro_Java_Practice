package com.wipro.annonymous.test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Ex10 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayanta", "Amit", "Vasu");
		
		Function<List<String>, List<Integer>> res = list -> { 
			List<Integer> name_len = new ArrayList<>();
            for (String s : list) {
                name_len.add(s.length());
            }
            return name_len;
        };
        
        List<Integer> out = res.apply(names);

        System.out.println("Names " + names);
        System.out.println("Name lengths " + out);

	}

}
