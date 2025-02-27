package com.celcom.day11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// unique key but value can be duplicate
		
		//does not maintain order
		Map<Integer, String> hashmap = new HashMap();
		
		//Maintains Sorted Order
		Map<Integer, String> treemap = new TreeMap();
		
		//Maintains the Insertion Order
		Map<Integer, String> linkedhashmap = new LinkedHashMap();
		
		hashmap.put(null, "Null Data");  // it works
		
		hashmap.put(0,"Empty");
		hashmap.put(0,"Overriden"); // overrides the existing value or creates new.
		hashmap.putIfAbsent(0,"Not Overriden"); //not override if already present.
		
		hashmap.put(1,"Sample Data 1");
		hashmap.put(2,"Sample Data 2");
		hashmap.put(3,"Sample Data 3");
		
		System.out.println(hashmap);
		
//		treemap.put(null, "Null Data"); // not working
		treemap.put(1,"Sample Data 1");
		treemap.put(2,"Sample Data 2");
		treemap.put(3,"Sample Data 3");
		
		System.out.println(treemap);
		
		linkedhashmap.put(null, "Null Data"); // it works
		linkedhashmap.put(1,"Sample Data 1");
		linkedhashmap.put(2,"Sample Data 2");
		linkedhashmap.put(3,"Sample Data 3");
		
		System.out.println(linkedhashmap);
		
		
		
	}

}
