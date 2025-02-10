package com.celcom.assignment1;

class Circle {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return 3.14 * radius;
	}

	double getCircumference() {
		return 3.14 * radius * radius;
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		Circle info = new Circle(21);
		System.out.println(info.getArea());
		System.out.println(info.getCircumference());
	}

}
