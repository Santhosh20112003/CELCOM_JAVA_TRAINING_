package com.celcom.assignment2;

import static com.celcom.assignment2.Assignment2.getStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		List<Integer> store = getStore(new Scanner(System.in), new ArrayList<>());

		for (int i = 0; i < store.size(); i++) {
			System.out.print(store.get(i) + " ");
		}

	}
}
