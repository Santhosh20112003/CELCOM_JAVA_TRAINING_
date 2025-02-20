package com.celcom.day11;

import java.util.ArrayList;
import java.util.List;

class Sequences {
	private List<Integer> obj = new ArrayList<Integer>();

	public Sequences(List<Integer> obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return obj.toString();
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		List<Integer> store = new ArrayList<>();
		store.add(1);
		store.add(4);
		store.add(20);
		store.add(3);
		store.add(10);
		store.add(5);
		store.add(15);
		store.add(18);
		System.out.println(store);

		List<Sequences> result = new ArrayList<>();

		for (int start = 0; start < store.size(); start++) {
			int sum = 0;
			List<Integer> sequence = new ArrayList<>();

			for (int end = start; end < store.size(); end++) {
				sum += store.get(end);
				sequence.add(store.get(end));

				if (sum == 33) {
					result.add(new Sequences(sequence));
				} else if (sum > 33) {
					break;
				}

			}
		}

		if (result.size() == 0) {
			System.out.println("No suspicious transactions found.");
		} else {
			System.out.println("Suspicious transaction sequences found: " + result);
		}

	}

}
