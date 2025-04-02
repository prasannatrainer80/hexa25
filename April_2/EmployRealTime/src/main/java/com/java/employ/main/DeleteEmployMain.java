package com.java.employ.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.employ.dao.EmployDao;
import com.java.employ.dao.EmployDaoImpl;

public class DeleteEmployMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter Employ Number  ");
		empno = sc.nextInt();
		EmployDao dao = new EmployDaoImpl();
		try {
			System.out.println(dao.deleteEmployDao(empno));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
