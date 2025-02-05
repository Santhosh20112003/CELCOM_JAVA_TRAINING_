package com.celcom.day2;

class Fruits {
	String name;
	int size;
	int price;

	void Display() {
		System.out.printf("Price of %s is %d and it is %d in Color.\n", name, price, size);
	}

	void setPrice(int price) {
		this.price = price;
	}

	Fruits(String name, int size, int price) {
		this.name = name;
		this.price = price;
		this.size = size;
	}
}

public class ClassAndObjectExample2 {
	public static void main(String[] args) {
		Fruits orange = new Fruits("Orange", 1, 80);
		orange.Display();
		orange.setPrice(100);
		orange.Display();
	}

}
