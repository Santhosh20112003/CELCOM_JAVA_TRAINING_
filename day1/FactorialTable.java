package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Iterations: ");
		int iterations = sc.nextInt();
		
		if(iterations > 0) {
			for(int num = 1; num<=iterations;num++) {
				int sum = 1;
				for(int i = 1;i<=num;i++) {
					sum *= i;
				}
				System.out.printf("Factorial of %d is %d \n",num, sum);	
			}	
		}
		else {
			System.out.println("Given Iteration is below 1");
		}

	}

}
