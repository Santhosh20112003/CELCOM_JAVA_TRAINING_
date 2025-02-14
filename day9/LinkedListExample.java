package com.celcom.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//suitable for manipulation insertion, deletion.
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(0));
		list.add(1, 15);
		System.out.println(list);
		list.set(1, 150);
		System.out.println(list);
		list.remove(new Integer(10));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.err.println(list.size());
		System.out.println(list.contains(30));
		// Travesing ways for list
		// way - 1
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		// way - 2
		for (Integer e : list) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		// way - 3
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

	}

}
