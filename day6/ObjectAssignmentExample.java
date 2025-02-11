package com.celcom.day6;

public class ObjectAssignmentExample {

	public static void main(String[] args) {
		ObjectAssignmentExample obj = new ObjectAssignmentExample();
		System.out.println(obj.hashCode());
		ObjectAssignmentExample obj1 = obj; //Object Assignment Both reference are pointing to same object.
		System.out.println(obj1.hashCode());
	}

}
