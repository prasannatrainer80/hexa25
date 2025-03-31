package com.java.leave.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.java.leave.bal.LeaveDetailsBal;
import com.java.leave.exception.LeaveDetailsException;
import com.java.leave.model.LeaveDetails;

public class LeaveDetailsMain {

	static LeaveDetailsBal leaveDetailsBal;
	static Scanner sc;
	
	static {
		leaveDetailsBal = new LeaveDetailsBal();
		sc = new Scanner(System.in);
	}
	
	public static void showLeaveDetailsMain() {
		List<LeaveDetails> listLeaveDetails = leaveDetailsBal.showLeaveDetailsBal();
		for (LeaveDetails leaveDetails : listLeaveDetails) {
			System.out.println(leaveDetails);
		}
	}
	
	public static void searchLeaveDetailsMain() {
		System.out.println("Enter Leave Id  ");
		int leaveId = sc.nextInt();
		LeaveDetails leaveDetailsFound = leaveDetailsBal.searchLeaveDetailsBal(leaveId);
		if (leaveDetailsFound != null) {
			System.out.println(leaveDetailsFound);
		} else {
			System.out.println("*** LeaveDetails Record Not Found ***");
		}
	}
	
	public static void addLeaveDetailsMain() throws ParseException, LeaveDetailsException {
		LeaveDetails leaveDetails = new LeaveDetails();
		System.out.println("Enter Leave Id  ");
		leaveDetails.setLeaveId(sc.nextInt());
		System.out.println("Enter Employee Id  ");
		leaveDetails.setEmpId(sc.nextInt());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Enter Leave-StartDate (yyyy-MM-dd)   ");
		leaveDetails.setLeaveStartDate(sdf.parse(sc.next()));
		System.out.println("Enter Leave-EndDate (yyyy-MM-dd)   ");
		leaveDetails.setLeaveEndDate(sdf.parse(sc.next())); 
		System.out.println("Enter LeaveReason  ");
		leaveDetails.setLeaveReason(sc.next());
		System.out.println(leaveDetailsBal.addLeaveDetailsBal(leaveDetails));
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("-------------");
			System.out.println("1. Add Leave  ");
			System.out.println("2. Show Leave  ");
			System.out.println("3. Search Leave  ");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addLeaveDetailsMain();
				} catch (ParseException e) {
					System.out.println(e.getMessage());
				} catch (LeaveDetailsException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2 : 
				showLeaveDetailsMain();
				break;
			case 3 : 
				searchLeaveDetailsMain();
				break;
			case 6 : 
				return;
			}
		} while(choice!=6);
	}
}
