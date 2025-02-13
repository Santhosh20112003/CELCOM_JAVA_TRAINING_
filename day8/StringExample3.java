package com.celcom.day8;

public class StringExample3 {

	public static void main(String[] args) {
		String s1 = "Java";
		s1.concat(" Programing"); // unreferenced Object
		System.out.println(s1);
		s1 = s1.concat(" Programing");// Object referenced to same object
		System.out.println(s1);

		// StringBuffer is Thread Safe in MultiThreading Environment due to presence of synchronized (mutable) internal buffer
		StringBuffer s2 = new StringBuffer("Hello");
		s2.append(" World");
		System.out.println(s2);

		//StringBuilder is not Thread Safe due to lack of synchronized keyword in its methods (mutable) internal buffer
		StringBuilder sb1 = new StringBuilder("");
		sb1.append(" World");
	}

}
