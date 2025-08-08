package com.wipro.oop;

import com.wipro.oop.Human;
import com.wipro.oop.Bird;
import com.wipro.oop.Dog;
import com.wipro.oop.Animal;

public class AnimalTest {
	public static void main(String[] args) {
        Animal human = new Human();
        Animal bird = new Bird();
        Animal dog = new Dog();
        
        human.setEat();
        human.setSleep();
        human.makeSound();


        bird.setEat();
        bird.setSleep();
        bird.makeSound();


        dog.setEat();
        dog.setSleep();
        dog.makeSound();;
    }

}
