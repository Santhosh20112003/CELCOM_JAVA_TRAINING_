package com.celcom.day6;

public class TryCatchExample1 {

	public static void main(String[] args) {
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
			// super class for Error 
		} catch (Exception e) {
			System.out.println(e);
			// super class for Exception
		} catch (Throwable e) {
			System.out.println(e);
			// super class for Error and Exception
		}
		
		System.out.println("After Exception");
	}

}
