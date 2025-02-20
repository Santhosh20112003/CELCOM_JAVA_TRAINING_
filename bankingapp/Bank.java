package com.celcom.bankingapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
