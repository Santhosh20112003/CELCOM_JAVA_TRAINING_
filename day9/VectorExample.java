package com.celcom.day9;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		// Vector
		Vector<Integer> store = new Vector<>(3, 2); // (capacity , increment factor)
		store.add(10);
		store.add(20);
		store.add(20);
		System.out.println(store.size());
		System.out.println(store.capacity());
		store.add(30);
		System.out.println(store.size());
		System.out.println(store.capacity());
		
		System.out.println(store);

		for (int i = 0; i < store.size(); i++) {
			System.out.println(store.get(i));
		}
		
		System.out.println(store);

		for (Integer i : store) {
			System.out.println(i);
		}

		Enumeration<Integer> obj = store.elements();
		System.out.println(obj);
		while (obj.hasMoreElements()) {
			System.out.println(obj.nextElement());
		}

	}

}
