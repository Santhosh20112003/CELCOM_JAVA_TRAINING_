package com.celcom.day2;

public class ArrayofArray {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8 , 9} }; //Jagged array : array of array with different sizes

		for (int i = 0; i < arr.length; i++) { // returns the outer array length
			for (int j = 0; j < arr[i].length; j++) { // returns the inner each array length at each iteration
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}