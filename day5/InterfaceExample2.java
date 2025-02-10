package com.celcom.day5;

interface AnimalPlan {
	abstract void move();

	abstract void eat();
}

abstract class Animal implements AnimalPlan {
	public abstract void move();

	public abstract void eat();
}

class Cat extends Animal {
	public void move() {
		System.out.println("Cat will move by Walk");
	}

	public void eat() {
		System.out.println("Cat will eat Rat");
	}
}

class Parrot extends Animal {
	public void move() {
		System.out.println("Parrot will move by Fly");
	}

	public void eat() {
		System.out.println("Parrot will eat Friuts");
	}
}

class Fish extends Animal {
	public void move() {
		System.out.println("Fish will move by Swim");
	}

	public void eat() {
		System.out.println("Fish will eat Sea Plants");
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		AnimalPlan animal;
		animal = new Cat();
		animal.move();
		animal.eat();
		animal = new Parrot();
		animal.move();
		animal.eat();
		animal = new Fish();
		animal.move();
		animal.eat();

	}

}
