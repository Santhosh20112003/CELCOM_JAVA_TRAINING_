package com.celcom.day13.customers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
	private static Connection con;
	private static String table_name = "customer";

	static {
		String url = "jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
		String username = "training";
		String password = "Celcom123";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to Database");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to Connect to Database");
		}
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean running = true;
			while (running) {
				System.out.println("\n--- Employee Management System ---");
				System.out.println("1. Add New Customer");
				System.out.println("2. Remove Existing Customer");
				System.out.println("3. Update Customer Details");
				System.out.println("4. Display Customers");
				System.out.println("5. Display Customers with Balance above Threshold");
				System.out.println("6. Deposit Amount");
				System.out.println("7. Withdraw Amount");
				System.out.println("8. Exit");
				System.out.print("Enter choice: ");

				if (scanner.hasNextInt()) {
					int choice = scanner.nextInt();
					scanner.nextLine(); // Consume newline

					switch (choice) {
					case 1 -> addCustomer();
					case 2 -> removeCustomer();
					case 3 -> updateCustomer();
					case 4 -> displayCustomer();
					case 5 -> displayCustomersWithBalance();
					case 6 -> depositAmount();
					case 7 -> withdrawAmount();
					case 8 -> {
						running = false;
						System.out.println("Exiting the Employee System...");
					}
					default -> System.out.println("Invalid choice, please select a valid option.");
					}
				} else {
					System.out.println("Invalid input. Please enter a number.");
					scanner.next(); 
				}
				
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private static void addCustomer() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Customer ID: ");
			int id = sc.nextInt();
			sc.nextLine(); // Consume newline
			System.out.println("Enter Customer Name: ");
			String name = sc.nextLine();
			System.out.println("Enter Account Number: ");
			String accountNumber = sc.nextLine();
			System.out.println("Enter Account Balance: ");
			double balance = sc.nextDouble();

			String query = "INSERT INTO " + table_name
					+ " (customer_id, name, account_number, balance) VALUES (?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, accountNumber);
			stmt.setDouble(4, balance);

			int rows = stmt.executeUpdate();
			if (rows == 0) {
				System.out.println("Customer added successfully.");
			}

			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void removeCustomer() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Customer ID to remove: ");
			int id = sc.nextInt();

			String query = "DELETE FROM " + table_name + " WHERE customer_id = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);

			int rows = stmt.executeUpdate();
			if (rows == 1) {
				System.out.println("Customer removed successfully.");
			}

			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateCustomer() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Customer ID to update: ");
			int id = sc.nextInt();
			sc.nextLine(); // Consume newline
			System.out.println("Enter new Account Balance: ");
			double balance = sc.nextDouble();

			String query = "UPDATE " + table_name + " SET balance = ? WHERE customer_id = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setDouble(1, balance);
			stmt.setInt(2, id);

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Customer updated successfully.");
			}

			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void displayCustomer() throws SQLException {
		String query = "SELECT * FROM " + table_name;

		PreparedStatement stmt = con.prepareStatement(query);

		ResultSet result = stmt.executeQuery();

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		System.out.printf("%-15s %-20s %-20s %-20s\n", "Customer ID", "Customer Name", "Account Number",
				"Account Balance");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");

		while (result.next()) {
			System.out.printf("%-15d %-20s %-20s %-20s\n", result.getInt(1), result.getString(2), result.getString(3),
					result.getDouble(4));
		}

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		result.close();
		stmt.close();
	}

	private static void displayCustomersWithBalance() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the minimum balance: ");
			double minBalance = sc.nextDouble();

			String query = "SELECT * FROM " + table_name + " WHERE balance > ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setDouble(1, minBalance);

			ResultSet result = stmt.executeQuery();

			System.out.println(
					"---------------------------------------------------------------------------------------------------------");
			System.out.printf("%-15s %-20s %-20s %-20s\n", "Customer ID", "Customer Name", "Account Number",
					"Account Balance");
			System.out.println(
					"--------------------------------------------------------------------------------------------------------");

			while (result.next()) {
				System.out.printf("%-15d %-20s %-20s %-20s\n", result.getInt(1), result.getString(2),
						result.getString(3), result.getDouble(4));
			}

			System.out.println(
					"------------------------------------------------------------------------------------------------------");

			result.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void depositAmount() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Customer ID: ");
			int id = sc.nextInt();
			System.out.println("Enter deposit amount: ");
			double amount = sc.nextDouble();

			String query = "UPDATE " + table_name + " SET balance = balance + ? WHERE customer_id = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setDouble(1, amount);
			stmt.setInt(2, id);

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Deposit successful.");
			}

			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void withdrawAmount() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Customer ID: ");
			int id = sc.nextInt();
			System.out.println("Enter withdrawal amount: ");
			double amount = sc.nextDouble();

			// Check balance first
			String checkQuery = "SELECT balance FROM " + table_name + " WHERE customer_id = ?";
			PreparedStatement checkStmt = con.prepareStatement(checkQuery);
			checkStmt.setInt(1, id);

			ResultSet result = checkStmt.executeQuery();
			if (result.next()) {
				double currentBalance = result.getDouble(1);
				if (currentBalance >= amount) {
					String query = "UPDATE " + table_name + " SET balance = balance - ? WHERE customer_id = ?";
					PreparedStatement stmt = con.prepareStatement(query);
					stmt.setDouble(1, amount);
					stmt.setInt(2, id);

					int rows = stmt.executeUpdate();
					if (rows > 0) {
						System.out.println("Withdrawal successful.");
					}

					stmt.close();
				} else {
					System.out.println("Insufficient balance.");
				}
			}

			result.close();
			checkStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
