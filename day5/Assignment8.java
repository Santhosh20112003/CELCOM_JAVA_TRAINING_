package com.celcom.day5;

class Animal {
	void makeSound() {
		System.out.println("Animal is Barking");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("Cat is Barking");
	}
}

public class Assignment8 {

	public static void main(String[] args) {
		Animal obj = new Cat();
		obj.makeSound();
	}

}
