package com.celcom.day4;

class Vehicle {
	void engine() {
		System.out.println("All Vehicles has one Engine.");
	}

	void wheel() {
		System.out.println("All Vehicles has Wheels.");
	}
}

class Wheels {
	void wheelModel() {
		System.out.println("Wheel model is MRF");
	}

	void noOfWheels(String vehicleType) {
		if (vehicleType.equals("Two Wheeler")) {
			System.out.println("I have Two Wheels");
		} else if (vehicleType.equals("Four Wheels")) {
			System.out.println("I have Four Wheels");
		}
	}
}

class Engine {
	void engineModel() {
		System.out.println("Engine Model is XYZ.");
	}
}

class Car extends Vehicle { // Is A Relationship.
	Wheels wheel = new Wheels(); // Has A Relationship.
	Engine engine = new Engine();// Has A Relationship.

	void engineModel() {
		engine.engineModel();
	}

	void wheelModel() {
		wheel.wheelModel();
	}
	
	void noOfWheels() {
		wheel.noOfWheels("Four Wheeler");
	}
}

public class HasAVsIsA {

	public static void main(String[] args) {
		Car car = new Car();
		car.engine();
		car.engineModel();
		
		car.wheel();
		car.noOfWheels();
		car.wheelModel();
		
	}

}
