package com.celcom.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

class EmployeeOperations {
	private static Connection con;
	private static String table_name = "Employee";
	private static boolean iteration = false;

	public static void accesstoParentStatic() {
	};

	static {
		if (!iteration) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "santhosh");
				System.out.println("Connected To Database..");

				boolean isCreated = createTable(table_name);

				if (isCreated) {
					System.out.println("Table '" + table_name + "' created successfully.");
				} else {
					System.out.println("Failed to create table '" + table_name + "' or it already exists.");
				}
				iteration = true;
			} catch (Exception e) {
				System.out.println("Unable to Connect to Database");
			}
		}
	}

	static boolean createTable(String name) {
		try {
			Statement stmt = con.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS " + name
					+ " (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), email VARCHAR(200), address VARCHAR(200), age INT);";
			table_name = name;
			return stmt.executeUpdate(sql) == 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	static boolean addEmployee(Employee obj) {
		try {
			PreparedStatement stmt = con.prepareStatement(
					"INSERT INTO " + table_name + " (name, email, address, age) VALUES (?, ?, ?, ?);");
			stmt.setString(1, obj.getName());
			stmt.setString(2, obj.getEmail());
			stmt.setString(3, obj.getAddress());
			stmt.setInt(4, obj.getAge());
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	static boolean removeEmployee(int id) {
		try {
			PreparedStatement stmt = con.prepareStatement("DELETE FROM " + table_name + " WHERE id = ?;");
			stmt.setInt(1, id);
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	static boolean updateEmployee(Employee obj) {
		try {
			PreparedStatement stmt = con.prepareStatement(
					"UPDATE " + table_name + " SET name = ?, email = ?, address = ?, age = ? WHERE id = ?;");
			stmt.setString(1, obj.getName());
			stmt.setString(2, obj.getEmail());
			stmt.setString(3, obj.getAddress());
			stmt.setInt(4, obj.getAge());
			stmt.setInt(5, obj.getId());
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	static ArrayList<Employee> displayEmployees() {
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM " + table_name + " ORDER BY AGE;");
			ResultSet rs = stmt.executeQuery();
			ArrayList<Employee> list = new ArrayList<>();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				int age = rs.getInt("age");
				Employee employee = new Employee(id, name, email, address, age);
				list.add(employee);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	static ArrayList<Employee> displayEmployees2() {
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM " + table_name + " ORDER BY AGE DESC;");
			ResultSet rs = stmt.executeQuery();
			ArrayList<Employee> list = new ArrayList<>();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				int age = rs.getInt("age");
				Employee employee = new Employee(id, name, email, address, age);
				list.add(employee);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	}

public class EmployeeApplication {
	private static final Scanner scanner = new Scanner(System.in);

	static {
		EmployeeOperations.accesstoParentStatic();
	}

	public static void main(String[] args) {
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
			case 1 -> addEmployee();
			case 2 -> removeEmployee();
			case 3 -> updateEmployee();
			case 4 -> displayEmployees();
			case 5 -> {
				running = false;
				System.out.println("Exiting the Employee System...");
			}
			default -> System.out.println("Invalid choice, please select a valid option.");
			}
		}

		scanner.close();
	}

	private static void addEmployee() {
		System.out.print("Enter Employee Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Email ID: ");
		String email = scanner.nextLine();
		System.out.print("Enter Address: ");
		String address = scanner.nextLine();
		System.out.print("Enter Age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		Employee obj = new Employee(name, email, address, age);
		boolean isAdded = EmployeeOperations.addEmployee(obj);
		if (isAdded) {
			System.out.println("Employee added successfully.");
		} else {
			System.out.println("Failed to add employee.");
		}
	}

	private static void removeEmployee() {
		System.out.print("Enter Employee ID to remove: ");
		int id = scanner.nextInt();
		boolean isRemoved = EmployeeOperations.removeEmployee(id);
		if (isRemoved) {
			System.out.println("Employee removed successfully.");
		} else {
			System.out.println("Failed to remove employee.");
		}
	}

	private static void updateEmployee() {
		System.out.print("Enter Employee ID to update: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter new Employee Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter new Email ID: ");
		String email = scanner.nextLine();
		System.out.print("Enter new Address: ");
		String address = scanner.nextLine();
		System.out.print("Enter new Age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		Employee obj = new Employee(id, name, email, address, age);
		boolean isUpdated = EmployeeOperations.updateEmployee(obj);
		if (isUpdated) {
			System.out.println("Employee updated successfully.");
		} else {
			System.out.println("Failed to update employee.");
		}
	}

	private static void displayEmployees() {	
		System.out.println("1)Experienced Employees\n2)Freshers");
		int opt = scanner.nextInt();
		System.out.println("Displaying employees:");
		ArrayList<Employee> empstore;
		switch(opt) {
			case 1:	
				empstore = EmployeeOperations.displayEmployees2();
				for (Employee employee : empstore) {
					System.out.println(employee);
				}
			break;
			case 2:
				empstore = EmployeeOperations.displayEmployees();
				for (Employee employee : empstore) {
					System.out.println(employee);
				}
			break;
			default:
				System.out.println("Invalid Operation");
				
		}
	}

}
