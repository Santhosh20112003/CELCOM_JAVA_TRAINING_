package com.celcom.assignment2;

import static com.celcom.assignment2.Assignment2.getStore;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment9 {
	public static void main(String[] args) {
		List<Integer> store = getStore(new Scanner(System.in), new LinkedList<>());

		for (int i = 0; i < store.size(); i++) {
			System.out.println("Element at " + i + "th index is " + store.get(i));
		}
	}
}
