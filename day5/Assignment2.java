package com.celcom.day5;

class Dog {
	String name, breed;

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		Dog obj = new Dog("Princy", "German Shipper");
		obj.setName("Princly");
		obj.setBreed("Bomaria");
		System.out.println(obj.name);
		System.out.println(obj.breed);
	}

}
