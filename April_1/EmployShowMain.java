package com.java.employ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployShowMain {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexamarch", "root", "root");
			System.out.println("Connected...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
