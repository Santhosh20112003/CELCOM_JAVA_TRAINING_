package com.celcom.day6;

import java.util.Scanner;

//Unchecked Exception

class InvalidAgeException extends Exception {
	int age;

	public InvalidAgeException(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return age + " is a Invalid Age Causes Invalid Age Exception";
	}
}

//Checked Exception

class NegativeAgeException extends RuntimeException {
	int age;

	public NegativeAgeException(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return age + " is a Negative Value causes NegativeAgeException";
	}
}

//Main Class calling Exception Class

public class CustomException {

	public static void main(String[] args) {
		int age = new Scanner(System.in).nextInt();

		try {
			if (age > 18) {
				System.out.println("Welcome to Vote");
			} else if (age < 1) {
				throw new NegativeAgeException(age);
			} else {
				throw new InvalidAgeException(age);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
