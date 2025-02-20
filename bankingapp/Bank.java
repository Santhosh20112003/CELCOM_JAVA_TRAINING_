package com.celcom.bankingapp;

import java.util.HashMap;
import java.util.Map;
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

public class Bank {
	private static final Scanner scanner = new Scanner(System.in);
	private static final BankList bank = new BankList();

	public static void main(String[] args) {
		boolean running = true;
		while (running) {
			System.out.println("\n--- Banking System Menu ---");
			System.out.println("1. Add Account");
			System.out.println("2. Remove Account");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Display Specific Account");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> addAccount();
			case 2 -> removeAccount();
			case 3 -> deposit();
			case 4 -> withdraw();
			case 5 -> displayAccount();
			case 6 -> {
				running = false;
				System.out.println("Exiting the Banking System...");
			}
			default -> System.out.println("Invalid choice, please select a valid option.");
			}
		}
		scanner.close();
	}

	private static void addAccount() {
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		long accountNumber = (long) (Math.random() * 9000000000L) + 1000000000L;
		bank.
		System.out.print("Enter Mobile Number: ");
		long mobile = scanner.nextLong();
		System.out.print("Set 4-digit PIN: ");
		int pin = scanner.nextInt();
		bank.addAccount(name, accountNumber, mobile, pin);
	}

	private static void removeAccount() {
		System.out.print("Enter Account Number to remove: ");
		long accountNumber = scanner.nextLong();
		bank.removeAccount(accountNumber);
	}

	private static void deposit() {
		System.out.print("Enter Account Number for Deposit: ");
		long accountNumber = scanner.nextLong();
		System.out.print("Enter Amount to Deposit: ");
		double amount = scanner.nextDouble();
		System.out.print("Enter PIN: ");
		int pin = scanner.nextInt();
		bank.deposit(accountNumber, amount, pin);
	}

	private static void withdraw() {
		System.out.print("Enter Account Number for Withdrawal: ");
		long accountNumber = scanner.nextLong();
		System.out.print("Enter Amount to Withdraw: ");
		double amount = scanner.nextDouble();
		System.out.print("Enter PIN: ");
		int pin = scanner.nextInt();
		bank.withdraw(accountNumber, amount, pin);
	}

	private static void displayAccount() {
		System.out.print("Enter Account Number to Display: ");
		long accountNumber = scanner.nextLong();
		System.out.print("Enter PIN: ");
		int pin = scanner.nextInt();
		bank.displayAccount(accountNumber, pin);
	}
}
