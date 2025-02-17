package com.celcom.assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static com.celcom.assignment2.Assignment2.getStore;

class ArrayLists extends ArrayList<Integer> implements Cloneable {
}

public class Assignment3 {

	public static void main(String[] args) {
		ArrayLists obj = (ArrayLists) getStore(new Scanner(System.in), new ArrayLists());
		ArrayLists obj2 = (ArrayLists) obj.clone();

		for (int i = 0; i < obj2.size(); i++) {
			System.out.println(obj2.get(i));
		}

	}

}
