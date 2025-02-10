package com.celcom.assignment1;

import java.util.ArrayList;
import java.util.List;

class Account {
	private String accountHolderName;
	private String accountNumber;
	private double balance;

	public Account(String accountHolderName, String accountNumber, double initialDeposit) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = initialDeposit;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid withdrawal amount.");
		}
	}

	public void displayAccountDetails() {
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}

class Bank {
	private List<Account> accounts;

	public Bank() {
		accounts = new ArrayList<>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
		System.out.println("Account added: " + account.getAccountNumber());
	}

	public void removeAccount(String accountNumber) {
		Account accountToRemove = null;
		for (Account account : accounts) {
			if (account.getAccountNumber().equals(accountNumber)) {
				accountToRemove = account;
				break;
			}
		}
		if (accountToRemove != null) {
			accounts.remove(accountToRemove);
			System.out.println("Account removed: " + accountToRemove.getAccountNumber());
		} else {
			System.out.println("Account with number " + accountNumber + " not found.");
		}
	}

	public Account findAccount(String accountNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}

	public void displayAllAccounts() {
		if (accounts.isEmpty()) {
			System.out.println("No accounts in the bank.");
		} else {
			System.out.println("Accounts in the bank:");
			for (Account account : accounts) {
				account.displayAccountDetails();
			}
		}
	}
}

public class Assignment7 {

	public static void main(String[] args) {
		Bank bank = new Bank();

		Account account1 = new Account("John Doe", "A12345", 1000);
		Account account2 = new Account("Jane Smith", "A67890", 2000);

		bank.addAccount(account1);
		bank.addAccount(account2);

		bank.displayAllAccounts();

		account1.deposit(500);
		account2.withdraw(1000);

		bank.displayAllAccounts();

		bank.removeAccount("A12345");

		bank.displayAllAccounts();
	}
}
