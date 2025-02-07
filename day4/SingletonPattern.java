package com.celcom.day4;

class Singleton {
	private static Singleton obj = new Singleton();

	private Singleton() {
		System.out.print("Hello from Class");
	}

	public static Singleton getObject() {
		return obj;
	}
	
	public void printHi() {
		System.out.println("From inner method of public");
	}
}

public class SingletonPattern {

	public static void main(String[] args) {
		
//		Singleton obj = new Singleton();
		
		Singleton newobj = Singleton.getObject();
		newobj.printHi();
	}

}
