package com.celcom.day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {

		boolean isValidEmail = isvalidEmailId("asdfgh@gmail.com");

		System.out.println(isValidEmail ? "Valid Email ID" : "InValid Email ID");

		boolean isValidPassword = isValidPassword("Santhosh@123");

		System.out.println(isValidPassword ? "Valid Password" : "InValid Password");
		
		boolean isValidPhoneNumber = isValidPhoneNumber("9043112861");

		System.out.println(isValidPhoneNumber ? "Valid PhoneNumber" : "InValid PhoneNumber");
	}

	private static boolean isvalidEmailId(String email) {
		String arr[] = email.split("@");
		if (arr.length != 2 || !"gmail.com".equals(arr[1])) {
			return false;
		}

		String mailpattern = "^[A-Za-z0-9.]+$";

		Pattern pattern = Pattern.compile(mailpattern);
		Matcher matcher = pattern.matcher(arr[0]);
		return matcher.matches();

	}

	private static boolean isValidPassword(String password) {
		Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$");
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	private static boolean isValidPhoneNumber(String phoneNumber) {
		if (phoneNumber.length() != 10)
			return false;
		Pattern pattern = Pattern.compile("^[0-9]+$");
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}

}
