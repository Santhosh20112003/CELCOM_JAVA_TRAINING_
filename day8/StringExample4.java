package com.celcom.day8;

public class StringExample4 {

	public static void main(String[] args) {
//		== checks for value and memory location
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println(a == c);
		c = 15;
		System.out.println(a == c);
		System.out.println(a + "" + c);

		System.out.println("-------------------------------------");

		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		String s3 = "Java";
		String s4 = "Java";
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);

	}

}
