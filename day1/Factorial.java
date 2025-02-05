package com.celcom.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int sum = 1;
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				sum *= i;
			}
			System.out.printf("Factorial of %d is %d", num, sum);
		} else {
			System.out.println("Given Number is below 1");
		}
	}

}
