package com.wipro.oop;

public abstract class Animal {

	public void setEat() {
        System.out.println("Eating");
    }

    public void setSleep() {
        System.out.println("Sleeping");
    }

    public abstract void makeSound();

}
