package com.celcom.day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");
		arrayList.add("Elderberry");

		System.out.println("ArrayList: " + arrayList);

		List<String> linkedList = new LinkedList<>(arrayList);

		System.out.println("LinkedList --> ArrayList: " + linkedList);

		List<String> arraylist2 = new ArrayList<>(linkedList);
		
		System.out.println("ArrayList --> LinkedList: "+arraylist2);
	}

}
