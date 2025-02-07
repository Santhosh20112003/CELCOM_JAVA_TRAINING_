package com.celcom.day3;

public class ThisKeywordChaining {
	private String name;

	ThisKeywordChaining() {
		this("Santhosh");
//		System.out.println(this);
	}

	ThisKeywordChaining(String name) {
		this(12);
		System.out.println(name);
	}

	ThisKeywordChaining(int val) {
		System.out.println(val);
	}

	public static void main(String args[]) {
		ThisKeyword obj1 = new ThisKeyword();
	}
}
