package com.celcom.day8;

import java.util.Calendar;

public class CalenderExample {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);

		System.out.print(c.get(c.YEAR) + "-");
		System.out.print(c.get(c.MONTH) + 1 + "-");
		System.out.println(c.get(c.DATE));

		System.out.print(c.get(c.HOUR) + "-");
		System.out.print(c.get(c.MINUTE) + "-");
		System.out.println(c.get(c.SECOND));
	}

}
