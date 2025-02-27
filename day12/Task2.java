package com.celcom.day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static <T> boolean addtwoList(T[] store1, T[] store2) {

		if (store1.length != store2.length) {
			return false;
		}

		for (int i = 0; i < store1.length; i++) {
			if (store1[i].equals(store2[i])) {
				continue;
			} else {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		Integer arr1[] = { 1, 2, 3 };
		Integer arr2[] = { 1, 2, 3 };
		String arr3[] = { new String("he"), "ho", "hn" };
		String arr4[] = { "he", "ho", "hn" };
		System.out.println(addtwoList(arr1, arr2));
		System.out.println(addtwoList(arr3, arr4));
	}

}
