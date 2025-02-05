package com.celcom.day2;

public class Array {

	public static void main(String[] args) {
		int arr[] = { 10, 20 };
		System.out.printf("Array Size is %d \n", arr.length);
		
		//traversing of array
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Array Element at %d is %d\n", i, arr[i]);
		}

		//sum of elements in an array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) sum += arr[i];
		System.out.printf("Sum of Array is %d\n", sum);
		
		//traversing using foreach
		for(int i : arr) {
			System.out.printf("%d\n",i);
		}
		
		

	}

}
