package com.celcom.day10;
 
import java.util.Arrays;

import java.util.Scanner;
 
public class Assignment4 {

	static boolean isEquals(int arr1[], int arr2[]) {

		if(arr1.length != arr2.length)

			return false;

		Arrays.sort(arr1);

		Arrays.sort(arr2);

		for(int i=0;i<arr1.length;i++) {

			if(arr1[i] != arr2[i]) {

				return false;

			}

		}

		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array 1 :");

		int n1 = sc.nextInt();

		int arr1[] = new int[n1];

		for(int i=0;i<n1;i++) {

			arr1[i] = sc.nextInt();

		}

		System.out.println("Enter the size of Array 2 :");

		int n2 = sc.nextInt();

		int arr2[] = new int[n1];

		for(int i=0;i<n2;i++) {

			arr2[i] = sc.nextInt();

		}	

		System.out.println(isEquals(arr1, arr2));


	}

}

 