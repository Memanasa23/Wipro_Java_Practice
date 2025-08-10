package com.wipro.annonymous.test;

import java.util.Arrays;
import java.util.List;

public class Ex13 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(3, 5, 7, 9, 11);

        int sum = num.stream().reduce(0, (a, b) -> a + b);
        int avg = sum / num.size();

        System.out.println(avg);

	}

}
