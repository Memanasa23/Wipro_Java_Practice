package com.wipro.oop.test;

import com.wipro.oop.Circle;
import com.wipro.oop.Rectangle;
import com.wipro.oop.Square;

public class ShapeTest {
	public static void main(String[] args) {
		Circle circle = new Circle("Red", true, 5.5);
        Rectangle rectangle = new Rectangle("Blue", false, 4.0, 6.0);
        Square square = new Square("Green", true, 3.0);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }

}
