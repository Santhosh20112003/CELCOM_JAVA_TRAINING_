package com.celcom.day6;

public class Throw {
	
	public static void main(String[] args) {

		try {
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("We can Catch Arithmetic Exception");
		}
	}
}
