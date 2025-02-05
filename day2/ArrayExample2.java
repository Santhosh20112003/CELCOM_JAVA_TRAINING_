package com.celcom.day2;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Initial Array values :");
		for (int i : arr) {
			System.out.printf("%d \t", arr[i]);
		}
		System.out.println("\nEnter the Array Size:");
		int size = sc.nextInt();
		int val[] = new int[size];
		System.out.println("Enter the values of Each");
		for (int i = 0; i < size; i++) {
			val[i] = sc.nextInt();
		}

		int sum = 0;
		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < size; i++) {
			sum += val[i];
			if (val[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
		System.out.printf("Array sum : %d\n", sum);
		System.out.printf("Array Even Count : %d\n", evenCount);
		System.out.printf("Array Odd Count : %d\n", oddCount);
		
		sc.close();

	}
}
