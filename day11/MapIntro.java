package com.celcom.day11;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		Map<Integer, String> store = new HashMap();

		// put() to add values to Map
		store.put(1, "Santhosh");
		System.out.println(store);

		// remove() removes the element with the key given.
		store.remove(1);
		System.out.println(store);

		store.put(2, "Yogesh");
		store.put(3, "Yogesh");
		store.put(4, "Yogesh");
		store.put(5, "Yogesh");

		System.out.println(store.containsKey(1));

		System.out.println(store.containsValue("Yogesh"));

		System.out.println(store.get(3));

		store.clear();
		System.out.println(store);

		store.merge(4, "Santhosh", (o, n) -> o + n);
		
		store.putIfAbsent(5, "New Data");

		// converts the Map to Set
		for (Map.Entry<Integer, String> data : store.entrySet()) {
			// display the Key and Value from the Map Object.
			System.out.println(data.getKey() + " " + data.getValue());
		}

	}

}
