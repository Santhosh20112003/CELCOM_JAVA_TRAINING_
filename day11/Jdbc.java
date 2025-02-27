package com.celcom.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pass = "santhosh";

		try {
			Connection con = DriverManager.getConnection(url, user, pass);

			System.out.println("Connected to Database.."); 
			
//			PreparedStatement tablecreation = con.prepareStatement("create table Book(bookid int primary key,bookname varchar(20));");
//			tablecreation.executeUpdate();
//			System.out.println("Table Created..");
			
			
//			PreparedStatement stmt2 = con.prepareStatement("DELETE FROM USER where id = ?");
//			stmt2.setInt(1, 14);
//
//			int n = stmt2.executeUpdate();
//			
//			if (n == 1) {
//				System.out.println("Record Deleted..");
//			}
			
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM user");
			ResultSet res = stmt.executeQuery();

			while (res.next()) {
				System.out.println(res.getInt("id") + " " + res.getString("name"));
			}
			
			res.close();
			
			
			PreparedStatement stmt2 = con.prepareStatement("insert into user(name) values(?)");
		
			stmt2.setString(1,"GENTS");
			
			int r = stmt2.executeUpdate();
			
			if(r == 1) {
				System.out.println("Record Added");
			}
			
			PreparedStatement stmt3 = con.prepareStatement("SELECT * FROM user");
			ResultSet res2 = stmt3.executeQuery();

			while (res2.next()) {
				System.out.println(res2.getInt("id") + " " + res2.getString("name"));
			}
			
			res.close();
			
			
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
