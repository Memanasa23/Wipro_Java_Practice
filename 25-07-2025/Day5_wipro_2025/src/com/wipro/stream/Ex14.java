package com.wipro.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex14 {
    public static void main(String[] args) {

        List<FoodItem> s = new ArrayList<>();

        s.add(new FoodItem("Noodles", "Chinese", 150));
        s.add(new FoodItem("Momos", "Nepal", 60));
        s.add(new FoodItem("Pani Puri", "Indian", 20));

        List<FoodItem> food = s
                .stream()
                .filter(t -> t.getTypeOfFood().equalsIgnoreCase("Chinese"))
                .collect(Collectors.toList());

        food.forEach(System.out::println);
    }
}
