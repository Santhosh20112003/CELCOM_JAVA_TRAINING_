package com.celcom.assignment2;

import static com.celcom.assignment2.Assignment2.getStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment10 {
	public static void main(String[] args) throws IndexOutOfBoundsException {

		LinkedList<Integer> store = (LinkedList<Integer>) getStore(new Scanner(System.in), new LinkedList<>());
		List<Integer> store2 =  (List<Integer>) store.clone();

		for (int i = 0; i < store2.size(); i++) {
			System.out.println("Element at " + i + "th index is " + store2.get(i));
		}
	}
}
