package com.celcom.day2;

public class ArrayofArrayExample2 {
	public static void main(String args[]) {
		int arr[][] = new int[3][];
		arr[0] = new int[] { 1, 2, 3 };
		arr[1] = new int[] { 4, 5 };
		arr[2] = new int[3];
		
		for (int i = 0; i < arr.length; i++) { // returns the outer array length
			for (int j = 0; j < arr[i].length; j++) { // returns the inner each array length at each iteration
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}