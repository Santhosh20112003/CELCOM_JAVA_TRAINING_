package com.celcom.day6;

public class ObjectCloningExample implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloningExample obj = new ObjectCloningExample();
		System.out.println(obj.hashCode());
		ObjectCloningExample obj1 = (ObjectCloningExample) obj.clone(); //Object Cloning return in Object class.
		System.out.println(obj1.hashCode());
	}

}
