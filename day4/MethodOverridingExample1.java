package com.celcom.day4;

class SuperClass {
	int age =10;
	void myMethod() {
		System.out.println("Hi From SuperClass");
	}
}

class SubClass extends SuperClass {
	void myMethod() {
		System.out.println("Hi From SubClass"+age);
	}
}

class SubClass2 extends SubClass {
	void myMethod() {
		System.out.println("Hi From SubClass"+age);
	}
}

public class MethodOverridingExample1 {

	public static void main(String[] args) {
		
		SuperClass obj1 = new SuperClass();
		obj1.myMethod();
		
		SuperClass obj2 = new SubClass();
		obj2.myMethod();
		System.out.println(obj2.age);
		
		obj2 = new SubClass2();
		
		SubClass obj3 = new SubClass();
		obj3.myMethod();
		System.out.println(obj3.age);

	}

}
