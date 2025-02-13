package com.celcom.day8;

public class Strings {

	public static void main(String[] args) {
		// ways to assign String object
		String s1 = "Hello";

		String s2 = new String("Hello");

		char ch[] = { 'H', 'e', 'l', 'l', 'o' };
		String s3 = new String(ch);

		System.out.println(s1 + " " + s2 + " " + s3);

	}

}
