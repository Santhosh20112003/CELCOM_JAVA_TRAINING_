package com.celcom.day6;

public class TryCatchExample2 {

	public static void main(String[] args) throws Exception {
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
			// other statements will not work.
			int b[] = new int[-5];
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (Error e) {
			System.out.println(e);
		} finally {
			System.out.println("Final block");
		}
		System.out.println("After Exception");

	}

}
