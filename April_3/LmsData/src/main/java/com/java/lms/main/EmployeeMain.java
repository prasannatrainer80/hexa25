package com.java.lms.main;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.java.lms.dao.EmployeeDao;
import com.java.lms.dao.EmployeeDaoImpl;
import com.java.lms.dao.LeaveHistoryDao;
import com.java.lms.dao.LeaveHistoryDaoImpl;
import com.java.lms.model.Employee;
import com.java.lms.model.LeaveHistory;

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
			System.out.println("3. Apply Leave");
			System.out.println("4. Search By Leave Id ");
			System.out.println("5. Show Leave-History ");
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
			case 3 : 
				try {
					applyLeaveMain();
				} catch (ClassNotFoundException | ParseException | SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4 : 
				try {
					searchByLeaveId();
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				break;
			case 5 : 
				try {
					showEmployeeLeaveHistory();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 8 : 
				return;
			}
		} while(choice != 8);
	}
	
	public static void searchByLeaveId() throws ClassNotFoundException, SQLException {
		System.out.println("Enter Leave Id  ");
		int leaveId = sc.nextInt();
		LeaveHistoryDao dao = new LeaveHistoryDaoImpl();
		LeaveHistory leaveHistory = dao.searchByLeaveId(leaveId);
		if (leaveHistory !=null) {
			System.out.println(leaveHistory);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
	
	public static Date convertSql(java.util.Date utilDate) {
		return new Date(utilDate.getTime());
	}
	
	public static void showEmployeeLeaveHistory() throws ClassNotFoundException, SQLException {
		int empId;
		System.out.println("Enter Employee Id  ");
		empId = sc.nextInt();
		LeaveHistoryDao dao = new LeaveHistoryDaoImpl();
		List<LeaveHistory> leaveHistory = dao.showLeaveHistory(empId);
		for (LeaveHistory leaveHistory2 : leaveHistory) {
			System.out.println(leaveHistory2);
		}
	}
	
	public static void applyLeaveMain() throws ParseException, ClassNotFoundException, SQLException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveHistory leaveHistory = new LeaveHistory();
		System.out.println("Enter Employee ID  ");
		leaveHistory.setEmpId(sc.nextInt());
		System.out.println("Enter Leave-Start Date (yyyy-MM-dd)  ");
		String date1 = sc.next();
		java.util.Date utilDate1 = sdf.parse(date1);
		leaveHistory.setLeaveStartDate(convertSql(utilDate1));
		System.out.println("Enter Leave-End Date (yyy-MM-dd)  ");
		String date2 = sc.next();
		java.util.Date utilDate2 = sdf.parse(date2);
		leaveHistory.setLeaveEndDate(convertSql(utilDate2));
		System.out.println("Leave Reason  ");
		leaveHistory.setLeaveReason(sc.next());
		LeaveHistoryDao dao = new LeaveHistoryDaoImpl();
		System.out.println(dao.applyLeave(leaveHistory));
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
