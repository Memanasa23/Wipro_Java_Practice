package com.wipro.oop.test;

import com.wipro.oop.converter;

public class TestConverter {
	public static void main(String[] args) {
        converter c = new converter();

        int first = c.convert(10);
        System.out.println(first);

        int second = c.convert(42, 39);
        System.out.println(second);

        double third = c.convert(98.5);
        System.out.println(third);
    }

}
