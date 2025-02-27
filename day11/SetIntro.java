package com.celcom.day11;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetIntro {

	public static void main(String[] args) {
		Set<Object> store = new HashSet();
		store.add(2.7);
		store.add("Santhosh");
		store.add(true);
		System.out.println(store);

		Set<Integer> store2 = new HashSet<Integer>();
		store2.add(12);
		store2.add(13);
		store2.add(14);
		store2.add(15);

		System.out.println(store.hashCode());

		System.out.println(store.containsAll(store2));

		store.retainAll(store2); // retain only common elements.

		System.out.println(store.isEmpty());

		System.out.println(store.remove(12));

		System.out.println(store.removeAll(store2)); // common elements will be removed

		store.addAll(store2);

		System.out.println(store);

		store.clear();

		System.out.println(store);

		for (Iterator iterator = store2.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
		}

		Iterator<Object> i = store.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		Object arr[] = store.toArray();

		Object arr2[] = store2.toArray();

		for (Object e : arr) {
			System.out.println(e);
		}

		try {
			Set<Object> store3 = new TreeSet();
			store3.add("New");
			store3.add(null);
			System.out.println(store3);
		} catch (Exception e) {
			System.err.println("GOT AN EXCEPTION");
		}

		Set<Object> store4 = new LinkedHashSet();

		store4.add(null);

		System.out.println(store4);

		Set<Integer> store5 = new LinkedHashSet();

		store5.add(20);

		store5.add(50);

		System.out.println(store5);

		Iterator<Integer> i2 = store5.iterator();

		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

		
//		List<String> pattern = new LinkedList<String>();
//		for (int j = 0; j < 5; j++) {
//			pattern.add("*");
//			System.out.println(pattern);
//		}
		
		

	}

}
