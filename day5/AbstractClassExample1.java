package com.celcom.day5;

class A {
	void hello() {
		System.out.println("Hii");
	}

// no	private abstract void h1(); 
// no 	final abstract void h2();
// no   static abstract void h3();

}

abstract class B extends A {
	static int age;

	abstract void hello();
}

class C extends B {
	void hello() {
		System.out.println("Hello There");
	}
}

abstract class Vehicle {
	int age;

	void noOfEngine() {

	}

	abstract void noOfWheels();

	public String toString() {
		return "Hello";
	}
}

class Car extends Vehicle {
	void noOfWheels() { // must define the
		System.out.println("I Have Four Wheels");
	}

	void noOfEngine() { // not mandatory
		System.out.println("I Have Four Wheels");
	}
}

public class AbstractClassExample1 {

	public static void main(String[] args) {
		Vehicle obj = new Car();
		A obj2 = new A();
		obj2.hello();

		System.out.println(B.age);

		B.age = 20;

		System.out.println(B.age);

		B obj3 = new C();
		obj3.hello();
	}

}
