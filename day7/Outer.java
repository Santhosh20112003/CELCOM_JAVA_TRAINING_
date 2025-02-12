package com.celcom.day7;

interface MyInterface {
	void display();
	void display(int a);
}

interface MyInterface1 {
	void display();
}

public class Outer {

	// inner class types

	// non static inner class
	class InnerClass1 {
		void myMethod() {
			System.out.println("Non static Inner Class");
		}
	}

	// static inner class
	static class InnerClass2 {
		void myMethod() {
			System.out.println("Static Inner Class");
		}
	}

	// local inner class

	void myMethod() {
		class InnerClass3 {
			void myMethod3() {
				System.out.println("Local Inner Class");
			}
		}
	}

	void myMethod1() {
		class InnerClass3 {
			void myMethod3() {
				System.out.println("Local Inner Class");
			}
		}

		InnerClass3 obj = new InnerClass3();
		obj.myMethod3();
	}

	Object myMethod2() {
		class InnerClass3 {
			void myMethod3() {
				System.out.println("Local Inner Class");
			}
		}
		return new InnerClass3();
	}

	// anonymous inner class
	// -- lambda expression java 8 came from anonymous inner class (must be
	// Functional Interface)

	public void display() {
		System.out.println("Annonymus Inner class");
	}

	public void display(int a) {
		System.out.println("Annonymus Inner class");
	}

	public static void main(String[] args) {

		Outer obj = new Outer();
		InnerClass1 obj2 = obj.new InnerClass1();
		obj2.myMethod();

		Outer.InnerClass2 obj3 = new Outer.InnerClass2();
		obj3.myMethod();

		Outer object = new Outer();
		object.display();

		MyInterface object1 = new MyInterface() {

			public void display() {
				System.out.println("Disaply 1");
			}

			public void display(int a) {
				System.out.println("Disaply 2");
			}
		};
		object1.display();
		object1.display(0);

		MyInterface1 object2 = () -> {
			System.out.println("Display");
		};
		object2.display();
	}

}
