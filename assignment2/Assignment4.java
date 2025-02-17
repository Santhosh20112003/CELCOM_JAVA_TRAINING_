package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static com.celcom.assignment2.Assignment2.getStore;

public class Assignment4 {

	public static void main(String[] args) {
		List<Integer> store = getStore(new Scanner(System.in), new ArrayList<>());
		Collections.reverse(store);
		for (Iterator iterator = store.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + " ");
		}
	}

}
