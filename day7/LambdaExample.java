package com.celcom.day7;

interface Calculator {
	double pi = Math.PI;

	int calc(int a, int b);
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = (int a, int b) -> {
			System.out.println(Calculator.pi);
			return a + b;
		};

		System.out.println(obj.calc(0, 0));

		obj = (int a, int b) -> {
			return a - b;
		};

		obj = (int a, int b) -> {
			return a * b;
		};

		obj = (int a, int b) -> {
			int c = a * b;
			return c;
		};

		obj = (a, b) -> {
			int c = a * b;
			return c;
		};
	}

}
