package com.celcom.assignment2;

import static com.celcom.assignment2.Assignment2.getStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		List<Integer> store = getStore(new Scanner(System.in), new LinkedList<>());

		for (int i = store.size() - 1; i >= 0; i--) {
			System.out.print(store.get(i) + " ");
		}
	}

}
