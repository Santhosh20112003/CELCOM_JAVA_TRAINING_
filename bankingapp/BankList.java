package com.celcom.bankingapp;

import java.util.HashMap;
import java.util.Map;

class BankList {
	private final Map<Long, Account> accounts = new HashMap<>();

	public void addAccount(String name, long accountNumber, long mobile, int pin) {
		Account newAccount = new Account(name, accountNumber, mobile, pin);
		accounts.put(accountNumber, newAccount);
		System.out.println("New Account Added:\n" + newAccount);
	}

	public void removeAccount(long accountNumber) {
		if (accounts.containsKey(accountNumber)) {
			System.out.println("Account Removed:\n" + accounts.get(accountNumber));
			accounts.remove(accountNumber);
		} else {
			System.out.println("Account not found with Account Number: " + accountNumber);
		}
	}

	public void deposit(long accountNumber, double amount, int pin) {
		Account acc = accounts.get(accountNumber);
		if (acc != null && acc.verifyPin(pin)) {
			acc.deposit(amount);
		} else {
			System.out.println("Invalid Account Number or PIN.");
		}
	}

	public void withdraw(long accountNumber, double amount, int pin) {
		Account acc = accounts.get(accountNumber);
		if (acc != null && acc.verifyPin(pin)) {
			acc.withdraw(amount);
		} else {
			System.out.println("Invalid Account Number or PIN.");
		}
	}

	public void displayAccount(long accountNumber, int pin) {
		Account acc = accounts.get(accountNumber);
		if (acc != null && acc.verifyPin(pin)) {
			System.out.println(acc);
		} else {
			System.out.println("Invalid Account Number or PIN.");
		}
	}
}
