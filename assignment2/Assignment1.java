package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> store = new ArrayList<Integer>();
		System.out.println("Enter 5 elements for the Store : ");
		for (int i = 0; i < 5; i++) {
			store.add(new Integer(sc.nextInt()));
		}

		System.out.println("Enter the search Element : ");
		Integer element = sc.nextInt();

		Collections.sort(store);

		if (store.get(store.size() - 1) > element) {
			System.out.println("Element not Found");
			return;
		}

		int index = -1;
		for (int i = 0; i < store.size(); i++) {
			if (store.get(i).equals(element)) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.out.println("Element Found at index : " + index);
		} else {
			System.out.println("Element not Found");
		}

	}

}
