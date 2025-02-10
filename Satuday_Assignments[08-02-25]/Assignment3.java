package com.celcom.day5;

class Rectangle {
	float width, height;

	void getArea() {
		System.out.println(width * height);
	}

	void getPerimeter() {
		System.out.println(2 * (width * height));
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

}

public class Assignment3 {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(12.0f, 13.0f);
		obj.getArea();
		obj.getPerimeter();
	}

}
