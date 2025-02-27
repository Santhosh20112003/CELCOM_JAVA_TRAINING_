
package com.celcom.day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public <T> List<T> addtwoList(List<T> store1, List<T> store2) {
		List<T> store = new ArrayList<T>();
		int maxlength = Math.max(store1.size(), store2.size());

		for (int i = 0; i < maxlength; i++) {
			if (i < store1.size()) {
				store.add(store1.get(i));
			}
			if (i < store2.size()) {
				store.add(store2.get(i));
			}
		}
		return store;

	}

	public static void main(String[] args) {
		Task1 obj = new Task1();
		
		List<String> list1 = List.of("he", "ho", "hn");
		List<String> list2 = List.of("oh", "nh", "mh");
		List<Integer> list3 = List.of(1, 2, 3);
		List<Integer> list4 = List.of(4, 5, 6);
		

		System.out.println(obj.<String>addtwoList(list1, list2));
		System.out.println(obj.<Integer>addtwoList(list3, list4));

	}

}
