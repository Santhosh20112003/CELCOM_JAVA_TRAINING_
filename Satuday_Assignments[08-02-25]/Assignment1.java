package com.celcom.day5;

class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

public class Assignment1 {

	public static void main(String[] args) {
		Person santhosh = new Person("Santhosh", 21);
		Person yogesh = new Person("Yogesh", 26);

		System.out.printf("Person Name is %s %d years old \n", santhosh.name, santhosh.age);
		System.out.printf("Person Name is %s %d years old", yogesh.name, yogesh.age);
	}

}
