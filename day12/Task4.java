package com.celcom.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Task4 {
	private static Connection con;
	private static String table_name = "customer";

	private static void createTableIfNotExists() throws SQLException {
		String createTableSQL = "CREATE TABLE customer (" + "name VARCHAR2(50), " + "dob VARCHAR(20), "
				+ "address VARCHAR2(100), " + "father VARCHAR2(50), " + "aadhar VARCHAR2(12) PRIMARY KEY, "
				+ "phoneNumber VARCHAR2(15))";

		try (Statement stmt = con.createStatement()) {
			stmt.executeUpdate(createTableSQL);
			System.out.println("Checked/Created table: " + table_name);
		} catch (SQLException e) {
			System.err.println("Unable to create table: " + e);
		}
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "santhosh", "santhosh");
			System.out.println("Connected to Database");
			createTableIfNotExists();
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
				System.out.println("1. Add New Employee");
				System.out.println("2. Remove Existing Employee");
				System.out.println("3. Update Employee Details");
				System.out.println("4. Display Employees");
				System.out.println("5. Exit");
				System.out.print("Enter choice: ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1 -> addCustomer(scanner);
				case 2 -> removeCustomer(scanner);
				case 3 -> updateCustomer(scanner);
				case 4 -> displayCustomer();
				case 5 -> {
					running = false;
					System.out.println("Exiting the Employee System...");
				}
				default -> System.out.println("Invalid choice, please select a valid option.");
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private static void displayCustomer() throws SQLException {
		String query = "SELECT * FROM customer";

		try (Statement stmt = con.createStatement(); ResultSet res = stmt.executeQuery(query)) {

			while (res.next()) {
				System.out.println(res.getString("name") + " | " + res.getString("dob") + " | "
						+ res.getString("address") + " | " + res.getString("father") + " | " + res.getString("aadhar")
						+ " | " + res.getString("phoneNumber"));
			}
		} catch (SQLException e) {
			System.err.println("Unable to execute query: " + e.getMessage());
		}
	}

	private static void updateCustomer(Scanner scanner) {
		System.out.print("Enter the employee's Aadhar number to update: ");
		String aadhar = scanner.nextLine();
		System.out.print("Enter the new address: ");
		String newAddress = scanner.nextLine();

		String updateQuery = "UPDATE customer SET address = '" + newAddress + "' WHERE aadhar = '" + aadhar + "'";

		try (Statement stmt = con.createStatement()) {
			int rowsAffected = stmt.executeUpdate(updateQuery);
			if (rowsAffected > 0) {
				System.out.println("Employee details updated successfully.");
			} else {
				System.out.println("Employee not found.");
			}
		} catch (SQLException e) {
			System.err.println("Unable to execute update: " + e.getMessage());
		}
	}

	private static void removeCustomer(Scanner scanner) {
		System.out.print("Enter the employee's Aadhar number to remove: ");
		String aadhar = scanner.nextLine();

		String deleteQuery = "DELETE FROM customer WHERE aadhar = '" + aadhar + "'";

		try (Statement stmt = con.createStatement()) {
			int rowsAffected = stmt.executeUpdate(deleteQuery);
			if (rowsAffected > 0) {
				System.out.println("Employee removed successfully.");
			} else {
				System.out.println("Employee not found.");
			}
		} catch (SQLException e) {
			System.err.println("Unable to execute delete: " + e.getMessage());
		}
	}

	private static void addCustomer(Scanner scanner) {
		System.out.print("Enter employee name: ");
		String name = scanner.nextLine();
		System.out.print("Enter employee DOB (yyyy-mm-dd): ");
		String dob = scanner.nextLine();
		System.out.print("Enter employee address: ");
		String address = scanner.nextLine();
		System.out.print("Enter employee father's name: ");
		String father = scanner.nextLine();
		System.out.print("Enter employee Aadhar number: ");
		String aadhar = scanner.nextLine();
		System.out.print("Enter employee phone number: ");
		String phoneNumber = scanner.nextLine();

		String insertQuery = "INSERT INTO customer (name, dob, address, father, aadhar, phoneNumber) VALUES ('" + name
				+ "', '" + dob + "', '" + address + "', '" + father + "', '" + aadhar + "', '" + phoneNumber + "')";

		try (Statement stmt = con.createStatement()) {
			stmt.executeUpdate(insertQuery);
			System.out.println("Employee added successfully.");
		} catch (SQLException e) {
			System.err.println("Unable to execute insert: " + e.getMessage());
		}
	}
}
