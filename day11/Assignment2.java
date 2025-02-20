package com.celcom.day11;

import java.util.Scanner;

public class Assignment2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String encipher = sc.next();

		if (encipher.charAt(0) == '0') {
			System.out.println("0");
			return;
		}

		int oneDigit = 1, twoDigit = 1;

		for (int i = 1; i < encipher.length(); i++) {
			int current = 0;
			if (encipher.charAt(i) != '0') {
				current += oneDigit;
			}

			int x = Integer.parseInt(encipher.substring(i - 1, i + 1));

			if (x >= 10 && x <= 26) {
				current += twoDigit;
			}
			
			twoDigit = oneDigit;
			oneDigit = current;

		}
		
		System.out.println(oneDigit);

	}

}
