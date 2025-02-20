package com.celcom.bankingapp;

class Account {
	private String name;
	private long accountNumber;
	private long mobile;
	private double balance;
	private int pin;

	public Account(String name, long accountNumber, long mobile, int pin) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.mobile = mobile;
		this.balance = 0.0;
		this.pin = pin;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public boolean verifyPin(int enteredPin) {
		return this.pin == enteredPin;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: " + amount + " | New Balance: " + balance);
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount + " | Current Balance: " + balance);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n" + "Account No.: " + accountNumber + "\n" + "Mobile: " + mobile + "\n"
				+ "Balance: " + balance + "\n" + "---------------------------";
	}
}
