package com.celcom.day5;

import java.util.Scanner;

interface Area {
	void calculateArea();
}

interface Perimeter {
	void calculatePerimeter();
}

abstract class Shape implements Area, Perimeter {
	double area;
	int radius;
	int length;
	int breadth;
	int height;

	Shape(int radius) {
		this.radius = radius;
	}

	Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		height = breadth;
	}
}

class Circle extends Shape {
	Circle(int radius) {
		super(radius);
	}

	public void calculateArea() {
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle : " + area);
	}

	public void calculatePerimeter() {
		area = 2 * (3.14 * radius);
		System.out.println("Perimeter of Circle : " + area);
	}
}

class Rectangle extends Shape {
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	public void calculateArea() {
		area = 0.5 * length * breadth;
		System.out.println("Area of Circle : " + area);
	}

	public void calculatePerimeter() {
		area = 2 * (length * breadth);
		System.out.println("Perimeter of Rectangle : " + area);
	}
}

class Triangle extends Shape {
	Triangle(int length, int height) {
		super(length, height);
	}

	public void calculateArea() {
		area = 0.5 * length * height;
		System.out.println("Area of Triangle : " + area);
	}

	public void calculatePerimeter() {
		area = (length * 2) + breadth;
		System.out.println("Perimeter of Triangle : " + area);
	}
}

public class InterfaceExample3 {
	public static void main(String[] args) {
		System.out.println("Enter your choice : \n1.Circle \n2.Rectangle \n3.Triangle");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Shape shape = null;
		switch (choice) {
		case 1:
			System.out.println("Enter radius: ");
			int radius = sc.nextInt();
			shape = new Circle(radius);
			shape.calculateArea();
			shape.calculatePerimeter();
			break;
		case 2:
			System.out.println("Enter Length and Breadth: ");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			shape = new Rectangle(length, breadth);
			shape.calculateArea();
			shape.calculatePerimeter();
			break;
		case 3:
			System.out.println("Enter Length and Height: ");
			int base = sc.nextInt();
			int height = sc.nextInt();
			shape = new Triangle(base, height);
			shape.calculateArea();
			shape.calculatePerimeter();
			break;
		}
		sc.close();
	}

}