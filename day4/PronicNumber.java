package com.celcom.day4;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num <= 1) {
			System.out.println("It is not a Pronic Number");
			return;
		}

		for (int i = 1; i <= num; i++) {
			int c = i * (i + 1);

			if (c == num) {
				System.out.println("It is a Pronic Number");
				break;
			} else if (c > num) {
				System.out.println("It is not a Pronic Number");
				break;
			}
		}

	}

}
