package com.celcom.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcExample {
	private static Connection con;
	private static String table_name;

	static {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "santhosh");
			System.out.println("Connected To Database..");
		} catch (Exception e) {
			System.out.println("Unable to Connect to Database");
		}
	}

	static boolean createTable(String name) {
		try {
			Statement stmt = con.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS " + name
					+ " (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200));";
			table_name = name;
			return stmt.executeUpdate(sql) == 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	static boolean insertData(String name) {
		try {
			PreparedStatement stmt = con.prepareStatement("INSERT INTO " + table_name + " (name) VALUES (?);");
			stmt.setString(1, name);
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	static boolean deleteData(int id) {
		try {
			PreparedStatement stmt = con.prepareStatement("DELETE FROM " + table_name + " WHERE id = ?;");
			stmt.setInt(1, id);
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	static boolean updateData(int id, String newName) {
		try {
			PreparedStatement stmt = con.prepareStatement("UPDATE " + table_name + " SET name = ? WHERE id = ?;");
			stmt.setString(1, newName);
			stmt.setInt(2, id);
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	static void displayData() {
		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM " + table_name + ";");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter table name to create: ");
		String tableName = scanner.nextLine();
		boolean isCreated = createTable(tableName);

		if (isCreated) {
			System.out.println("Table '" + tableName + "' created successfully.");
		} else {
			System.out.println("Failed to create table '" + tableName + "' or it already exists.");
			return;
		}

		if (table_name == null || table_name.isEmpty()) {
			System.out.println("Table name is not set properly.");
			return;
		}

		System.out.print("Enter " + table_name + " name to insert: ");
		String Name = scanner.nextLine();
		boolean isInserted = insertData(Name);
		if (isInserted) {
			System.out.println("Data inserted successfully.");
		} else {
			System.out.println("Failed to insert data.");
		}

		System.out.print("Enter " + table_name + " ID to update: ");
		int updateId = scanner.nextInt();
		scanner.nextLine(); 
		System.out.print("Enter new " + table_name + " name: ");
		String newName = scanner.nextLine();
		boolean isUpdated = updateData(updateId, newName);
		if (isUpdated) {
			System.out.println("Data updated successfully.");
		} else {
			System.out.println("Failed to update data.");
		}

		System.out.print("Enter " + table_name + " ID to delete: ");
		int deleteId = scanner.nextInt();
		boolean isDeleted = deleteData(deleteId);
		if (isDeleted) {
			System.out.println("Data deleted successfully.");
		} else {
			System.out.println("Failed to delete data.");
		}

		System.out.println("Displaying data:");
		displayData();

		scanner.close();
	}
}
