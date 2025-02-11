package com.celcom.day6;

import java.util.Scanner;

class DuplicateNumberException extends Exception {
	int num;

	public DuplicateNumberException(int num) {
		this.num = num;

	}

	@Override
	public String toString() {
		return "Number " + num + " is already present";
	}
}

public class Assignment1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the numbers:");
		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			int j = 0;
			boolean flag = false;
			while (j != size - 1) {
				if (arr[j] == num) {
					flag = true;
					break;
				} else {
					j++;
				}

			}
			if (!flag) {
				arr[i] = num;
			} else {
				i--;
				try {
					throw new DuplicateNumberException(num);
				} catch (DuplicateNumberException e) {
					System.out.println(e);
				}
			}
		}
		System.out.println("Array Numbers are:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}