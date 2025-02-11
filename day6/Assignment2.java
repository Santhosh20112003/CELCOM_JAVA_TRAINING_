package com.celcom.day6;

import java.util.Scanner;

class NoVovelException extends Exception {
	String str;

	public NoVovelException(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Vovel is not present in " + str;
	}
}

public class Assignment2 {

	static boolean isVovel(char ch) {
		String str = "aeiouAEIOU";
		return (str.indexOf(ch) != -1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");

		String str = sc.next();
		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (isVovel(a)) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println(str + " contain vovel");
		} else {
			try {
				throw new NoVovelException(str);
			} catch (NoVovelException e) {
				System.out.println(e);
			}
		}
	}

}