package com.celcom.day8;

public class StringMethodExample1 {

	public static void main(String[] args) {
		String s1 = "Java Programing";

		System.out.println("Length of the String : " + s1.length());
		System.out.println("Character at 4th index of the String : " + s1.charAt(4));

		System.out.println("String Uppercase : " + s1.toLowerCase());
		System.out.println("String Lowercase : " + s1.toUpperCase());

		System.out.println("" + s1.concat(" Book"));
		System.out.println("" + s1.replace("J", "T"));

		System.out.println("" + s1.equals("java Programing"));
		System.out.println("" + s1.equalsIgnoreCase("java Programing"));
		System.out.println("" + s1.contains("Programing"));

		System.out.println("" + s1.startsWith("Java"));
		System.out.println("" + s1.endsWith("ing"));

		System.out.println("" + s1.substring(5));
		System.out.println("" + s1.substring(0, 4));

		System.out.println("" + s1.indexOf('a'));
		System.out.println("" + s1.indexOf("Programing"));

	}

}
