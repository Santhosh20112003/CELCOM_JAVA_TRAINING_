package com.celcom.day8;

import java.util.Date;

public class DateExacmple {

	public static void main(String[] args) {
		Date obj = new Date();
		System.out.println(obj);
		System.out.println(obj.getDate());
		System.out.println(obj.getMonth());
		System.out.println(1900 + obj.getYear()); // starts counting from 1900

		System.out.println("-------------------------");

		System.out.println(obj.getTime());
		System.out.println(obj.getHours());
		System.out.println(obj.getMinutes());
		System.out.println(obj.getSeconds());

		System.out.println("-------------------------");

		System.out.println(obj.after(new Date()));
		System.out.println(obj.before(new Date()));
		System.out.println(obj.getTime());
		
		System.out.println("-------------------------");

	}

}
