package com.celcom.day1;

class CommandLineArgumentExample2 {
	public static void main(String values[]){
		if(values.length == 2){
			int num1 = Integer.parseInt(values[0]);
			int num2 = Integer.parseInt(values[1]);
			System.out.println("Addition :" + (num1+num2)); // here the num1 and num2 will not string concatenation.
		}
		else{
			System.out.println("Expecting 2 numbers as command line Argument");
		}
	}
}