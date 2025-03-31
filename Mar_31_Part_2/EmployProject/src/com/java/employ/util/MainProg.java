package com.java.employ.util;

import java.util.List;
import java.util.Scanner;

import com.java.employ.bal.EmployBal;
import com.java.employ.exception.EmployException;
import com.java.employ.model.Employ;
import com.java.employ.model.Gender;

public class MainProg {

	static EmployBal employBal;
	static Scanner scanner;
	
	static {
		employBal = new EmployBal();
		scanner = new Scanner(System.in);
	}
	
	public static void deleteEmployMain() {
		int empno;
		System.out.println("Enter Employ Number   ");
		empno = scanner.nextInt();
		System.out.println(employBal.deleteEmployBal(empno));
	}
	
	public static void updateEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ Number   ");
		employ.setEmpno(scanner.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(scanner.next());
		System.out.println("Enter Gender (MALE/FEMALE)   ");
		employ.setGender(Gender.valueOf(scanner.next()));
		System.out.println("Enter Department  ");
		employ.setDept(scanner.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(scanner.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(scanner.nextDouble()); 
		System.out.println(employBal.updateEmployBal(employ));
	}
	
	public static void searchEmployMain() {
		int empno;
		System.out.println("Enter Employ Number   ");
		empno = scanner.nextInt();
		Employ employ = employBal.searchEmployBal(empno);
		if (employ !=null) {
			System.out.println(employ);
		} else {
			System.out.println("*** Emplo Record Not Found ***");
		}
	}
	
	public static void showEmployMain() {
		List<Employ> employList = employBal.showEmployBal();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
	
	public static void addEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ Number   ");
		employ.setEmpno(scanner.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(scanner.next());
		System.out.println("Enter Gender (MALE/FEMALE)   ");
		employ.setGender(Gender.valueOf(scanner.next()));
		System.out.println("Enter Department  ");
		employ.setDept(scanner.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(scanner.next());
		System.out.println("Enter Basic   ");
		employ.setBasic(scanner.nextDouble()); 
		System.out.println(employBal.addEmployBal(employ));
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. Update Employ");
			System.out.println("5. Delete Employ");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice   ");
			choice = scanner.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addEmployMain();
				} catch (EmployException e) {
					e.printStackTrace();
				}
				break;
			case 2 : 
				showEmployMain();
				break;
			case 3 : 
				searchEmployMain();
				break;
			case 4 : 
				try {
					updateEmployMain();
				} catch (EmployException e) {
					e.printStackTrace();
				}
				break;
			case 5 : 
				deleteEmployMain();
				break;
			case 6 : 
				return;
			}
		} while(choice != 6);
	}
}
