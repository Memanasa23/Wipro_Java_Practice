package com.wipro.oop;

public class Square extends Shape {
	
	double side;

	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	

}
