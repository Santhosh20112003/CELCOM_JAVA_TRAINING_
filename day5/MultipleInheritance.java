package com.celcom.day5;
//CC -e
//ii -e

interface One {
	int a = 10; // by default interface variable all are public static final

}

interface Two {
	int b = 20;
}

interface Three extends One, Two {
	void addition();
	void subtraction();
}

class Addition implements Three {
	public void addition() {
		System.out.printf("%d + %d = %d", a, b, a + b);
	}

	public void subtraction() {
		System.out.printf("%d + %d = %d", a, b, a - b);
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Three obj = new Addition();
		obj.addition();
		obj.subtraction();
	}

}
