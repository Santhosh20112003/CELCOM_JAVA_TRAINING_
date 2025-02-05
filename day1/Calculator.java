package com.celcom.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int j = 1;
		Scanner sc = new Scanner(System.in);
		while(j == 1) {
			System.out.println("Enter your choice \n 1)addition\n 2)subtraction\n 3)multiplication\n 4)division\n 5)modulus");
			int choice = sc.nextInt();
			System.out.println("Enter number1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter number2 : ");
			int num2 = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
				break;
			case 2:
				System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
				break;
			case 3:
				System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
				break;
			case 4:
				System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
				break;
			case 5:
				System.out.printf("%d % %d = %d", num1, num2, num1 % num2);
				break;
			default:
				System.out.println("Invalid Operation Selected");
			}
			System.out.println("\nDo you want to continue\n 1)yes\n 2)no\n");
			j = sc.nextInt();
		}
		sc.close();

	}

}
