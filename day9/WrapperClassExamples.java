package com.celcom.day9;

public class WrapperClassExamples {

	public static void main(String[] args) {

		int a = 10;
		Integer obj = new Integer(a); // Boxing
		int b = obj.intValue(); // Un-Boxing

		Integer obj2 = a; // auto Boxing
		int c = obj2; // auto Un-Boxing 
		
	}

}
