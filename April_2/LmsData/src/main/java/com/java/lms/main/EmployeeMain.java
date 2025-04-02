package com.java.lms.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.lms.dao.EmployeeDao;
import com.java.lms.dao.EmployeeDaoImpl;
import com.java.lms.model.Employee;

public class EmployeeMain {

	static EmployeeDao employeeDao;
	static Scanner sc;
	
	static {
		employeeDao = new EmployeeDaoImpl();
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S ");
			System.out.println("--------------");
			System.out.println("1. Show Employee");
			System.out.println("2. Search Employee ");
			System.out.println("8. Exit");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				showEmployeeMain();
				break;
			case 2 : 
				searchEmployeeMain();
				break;
			case 8 : 
				return;
			}
		} while(choice != 8);
	}
	
	public static void searchEmployeeMain() {
		int empId;
		System.out.println("Enter Employee Id  ");
		empId = sc.nextInt();
		try {
			Employee employee = employeeDao.searchEmployeeDao(empId);
			if (employee != null) {
				System.out.println(employee);
			} else {
				System.out.println("*** Employee Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showEmployeeMain() {
		try {
			List<Employee> employeeList = employeeDao.showEmployeeDao();
			for (Employee employee : employeeList) {
				System.out.println(employee);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
