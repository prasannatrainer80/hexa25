package com.java.main;

import java.util.List;
import java.util.Scanner;

import com.java.dao.EmployDao;
import com.java.dao.EmployDaoImpl;
import com.java.model.Employ;
import com.java.model.Gender;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static EmployDao dao = new EmployDaoImpl();
	
	public static void searchEmployMain() {
		int empno;
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		Employ employFound = dao.searchEmployDao(empno);
		if (employFound != null) {
			System.out.println(employFound);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
	
	public static void showEmployMain() {
		List<Employ> employList = dao.showEmployDao();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
	
	public static void addEmployMain() {
		Employ employNew = new Employ();
		System.out.println("Enter Employ No  ");
		employNew.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		employNew.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)   ");
		employNew.setGender(Gender.valueOf(sc.next())); 
		System.out.println("Enter Department  ");
		employNew.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employNew.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employNew.setBasic(sc.nextDouble());
		System.out.println(dao.addEmployDao(employNew));
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			
			System.out.println("O P T I O N S");
			System.out.println("--------------");
			System.out.println("1. Add Employ");
			System.out.println("2. Search Employ");
			System.out.println("3. Show Employ");
			System.out.println("4. Exit");
			System.out.println("Enter Choice   ");
			choice = sc.nextInt();
			switch(choice) {
				case 1 : 
						addEmployMain();
						break;
				case 2 : 
						searchEmployMain();
						break;
				case 3 : 
						showEmployMain();
						break;
				case 4 : 
						return;
			}
			
			
		} while(choice!=4);
	}
}
