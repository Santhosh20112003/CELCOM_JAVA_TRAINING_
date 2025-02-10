package com.celcom.day5;

interface VehiclePlan1 { // just a plan about anything i.e house plan
	void noOfEngine();

}

interface VehiclePlan2 { // just a plan about anything i.e house plan
	void brandName();

	void noOfWheels();
}

class CaR implements VehiclePlan1, VehiclePlan2 {
	public void noOfEngine() {

	}

	public void brandName() {

	}

	public void noOfWheels() {

	}
}

//abstract class Vehicles implements VehiclePlan1 {
//	// foundation and piller of house i.e Structure of the house
//	public void noOfEngine() {
//
//	}
//}
//
//class Bus extends Vehicles {
//	// wood works, bricks i.e House
//
//	public void noOfWheels() {
//
//	}
//
//}

public class InterfaceExample1 {

	public static void main(String[] args) {

	}

}
