package com.celcom.day2;

import java.util.Arrays;

public class ArraySortingExample {

	public static void main(String[] args) {

		int arr[] = { 30, 50, 20, 100, 10 };

		Arrays.sort(arr);

		// Ascending Order
		System.out.println("Sorted Array:");

		for (int i : arr) {
			System.out.printf("%d\t", i);
		}
		System.out.println();

		// Minimum and Second Minimum
		System.out.println("Minimum value of Array is " + arr[0]);
		System.out.println("Second Minimum value of Array is " + arr[0]);

		// Maximum and Second Maximum
		System.out.println("Maximum value of Array is " + arr[arr.length - 1]);
		System.out.println("Second Maximum value of Array is " + arr[arr.length - 2]);

		// Descending Order
		System.out.println("Araay sorting in Reverse Order \n");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("%d ", arr[i]);

		}
		System.out.println();
		boolean arr2[] = { true, false, true, false };

		for (boolean i : arr2) {
			System.out.print(i+"\t");
		}
		
//		Arrays.sort(arr2);
//		
//		for (boolean i : arr2) {
//			System.out.print(i+"\t");
//		}
	}

}
