package com.wipro.stream;

import java.util.ArrayList;
import java.util.List;

public class Ex15 {

	public static void main(String[] args) {
		List<FoodItem> s = new ArrayList<>();

		s.add(new FoodItem("Noodles", "Chinese", 150));
		s.add(new FoodItem("Manchurian", "Chinese", 200));
        s.add(new FoodItem("Momos", "Nepal", 60));
        s.add(new FoodItem("Pani Puri", "Indian", 20));

        FoodItem exp = s
                .stream()
                .filter(f -> f.getTypeOfFood().equalsIgnoreCase("Chinese"))
                .reduce((a, b) -> a.getPrice() > b.getPrice() ? a : b)
                .get();

        System.out.println(exp);

	}

}
