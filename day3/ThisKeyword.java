package com.celcom.day3;

public class ThisKeyword {
	final int age;
	private String name;

//	ThisKeyword() {
//		System.out.println("Empty Constructor");
//	}
//
//	ThisKeyword(String name) {
//		System.out.println(name);
//	}

	ThisKeyword(int val) {
		this.age = val;
		System.out.println(age);
	}

	public static void main(String args[]) {
//		ThisKeyword obj1 = new ThisKeyword();
//		ThisKeyword obj2 = new ThisKeyword("Santhosh");
		ThisKeyword obj3 = new ThisKeyword(12);
	}
}
