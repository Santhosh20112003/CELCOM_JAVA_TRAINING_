package com.celcom.day5;

class Vehicle {
	void drive() {
		System.out.println("Driving a Vehicle");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Assignment9 {

	public static void main(String[] args) {
		Vehicle obj = new Car();
		obj.drive();
	}

}