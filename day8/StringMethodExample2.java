package com.celcom.day8;

public class StringMethodExample2 {

	public static void main(String[] args) {
		// Traversing Java Strings

		String s1 = "Java";
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}

		for (char c : s1.toCharArray()) {
			System.out.println(c);
		}

		for (int i = 0; i < s1.toCharArray().length; i++) {
			System.out.println(s1.toCharArray()[i]);
		}

		String s2 = "Welcome to Java Programing";
		String temp[] = s2.split(" ");

		for (String str : temp) {
			System.out.println(str);
		}

	}

}
