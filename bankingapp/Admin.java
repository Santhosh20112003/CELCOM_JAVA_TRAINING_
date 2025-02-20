package com.celcom.bankingapp;

import java.util.Scanner;

class Admin {
	private static final String PASSKEY = "ADMIN@123";

	public static boolean verifyAdmin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Admin PassKey: ");
		String inputPasskey = scanner.next();
		return PASSKEY.equals(inputPasskey);
	}
}