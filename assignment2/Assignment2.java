package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {

	public static List<Integer> getStore(Scanner sc, List<Integer> store) {
		System.out.println("Enter 5 elements for the Store : ");
		for (int i = 0; i < 5; i++) {
			store.add(sc.nextInt());
		}
		return store;
	}

	public static void main(String[] args) {
		List<Integer> store = getStore(new Scanner(System.in), new ArrayList<>());

		Collections.sort(store);

		for (Iterator iterator = store.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + " ");
		}
	}

}
