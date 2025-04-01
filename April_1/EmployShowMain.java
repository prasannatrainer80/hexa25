package com.java.employ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployShowMain {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexamarch", "root", "root");
//			System.out.println("Connected...");
			String cmd = "select * from Employ";
			PreparedStatement pst = connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Employ Name  " + rs.getString("Name"));
				System.out.println("Gender  " +rs.getString("gender"));
				System.out.println("Department  " +rs.getString("dept"));
				System.out.println("Designation  " +rs.getString("desig"));
				System.out.println("Salary  " +rs.getDouble("basic"));
				System.out.println("---------------------------------------------------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
