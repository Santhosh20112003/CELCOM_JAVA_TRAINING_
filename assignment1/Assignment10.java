package com.celcom.assignment1;

class Shape {
	int getArea() {
		return 0;
	}
}

class RectanglE extends Shape {
	int l, b;

	int getArea() {
		return l * b;
	}

	RectanglE(int l, int b) {
		this.l = l;
		this.b = b;
	}
}

public class Assignment10 {

	public static void main(String[] args) {
		Shape obj = new RectanglE(10, 12);
		System.out.println("Area of the Rectangle is " + obj.getArea());
	}

}
