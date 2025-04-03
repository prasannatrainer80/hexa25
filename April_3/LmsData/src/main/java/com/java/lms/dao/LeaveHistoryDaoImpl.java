package com.java.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.java.lms.model.LeaveHistory;
import com.java.lms.model.LeaveStatus;
import com.java.lms.model.LeaveType;
import com.java.lms.util.ConnectionHelper;

public class LeaveHistoryDaoImpl implements LeaveHistoryDao {

	Connection connection;
	PreparedStatement pst;
	
	public int dateDiff(Date startDate, Date endDate) {
		long ms = endDate.getTime() - startDate.getTime();
		long days = (ms / (1000 * 60 * 60 * 24));
		return (int)days;
	}
	
	@Override
	public String applyLeave(LeaveHistory leaveHistory) throws ClassNotFoundException, SQLException {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		int leaveBal = employeeDao.searchEmployeeDao(leaveHistory.getEmpId()).getEmpAvailLeaveBal();
		System.out.println(leaveBal);
		Date today = new Date();
		Date utilDate1 = new Date(leaveHistory.getLeaveStartDate().getTime());
		Date utilDate2 = new Date(leaveHistory.getLeaveEndDate().getTime());
		
		if (dateDiff(today, utilDate1) < 0) {
			return "Leave-Start Date Cannot be Yesterday...";
		} else if (dateDiff(today,utilDate2) < 0) {
				return "Leave End-Date Cannot be Yesterday...";
		} else if (dateDiff(utilDate1, utilDate2) < 0) {
				return "Leave-StartDate Cannot be Greater than Leave-End Date...";
			} else if (dateDiff(utilDate1, utilDate2) - leaveBal > 0) {
				return "Insufficient Leave Balalnce...";
		} else {
			int days = dateDiff(utilDate1, utilDate2);
			days++;
			leaveHistory.setNoOfDays(days);
			leaveHistory.setLeaveStatus(LeaveStatus.PENDING);
			leaveHistory.setLeaveType(LeaveType.EL);
			String cmd = "Insert into Leave_History(Emp_ID,LEAVE_START_DATE,LEAVE_END_DATE,LEAVE_NO_OF_DAYS,"
					+ "Leave_Reason,Leave_Type,Leave_Status) values(?,?,?,?,?,?,?)";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, leaveHistory.getEmpId());
			pst.setDate(2, leaveHistory.getLeaveStartDate());
			pst.setDate(3, leaveHistory.getLeaveEndDate());
			pst.setInt(4, days);
			pst.setString(5, leaveHistory.getLeaveReason());
			pst.setString(6, leaveHistory.getLeaveType().toString());
			pst.setString(7, leaveHistory.getLeaveStatus().toString());
			pst.executeUpdate();
			cmd = "Update Employee set EMP_AVAIL_LEAVE_BAL = EMP_AVAIL_LEAVE_BAL - ? "
					+ " Where Emp_ID = ?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, days);
			pst.setInt(2, leaveHistory.getEmpId());
			pst.executeUpdate();
			return "Leave Applied Successfully...";
		}
	}

	@Override
	public LeaveHistory searchByLeaveId(int leaveId) throws ClassNotFoundException, SQLException {
		String cmd = "select * from leave_history where LEAVE_ID = ?";
		Connection connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveId);
		ResultSet rs= pst.executeQuery();
		LeaveHistory leaveHistory = null;
		if (rs.next()) {
			leaveHistory = new LeaveHistory();
			leaveHistory.setLeaveId(rs.getInt("LEAVE_ID"));
			leaveHistory.setEmpId(rs.getInt("EMP_ID"));
			leaveHistory.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveHistory.setLeaveType(LeaveType.valueOf(rs.getString("LEAVE_TYPE")));
			leaveHistory.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
			leaveHistory.setLeaveReason(rs.getString("LEAVE_REASON"));
			
		}
		return leaveHistory;
	}

	@Override
	public List<LeaveHistory> showLeaveHistory(int empId) throws ClassNotFoundException, SQLException {
		String cmd = "select * from Leave_History where Emp_ID = ?";
		Connection connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs= pst.executeQuery();
		List<LeaveHistory> listLeaveHistory = new ArrayList<LeaveHistory>();
		LeaveHistory leaveHistory = null;
		while(rs.next()) {
			leaveHistory = new LeaveHistory();
			leaveHistory.setLeaveId(rs.getInt("LEAVE_ID"));
			leaveHistory.setEmpId(rs.getInt("EMP_ID"));
			leaveHistory.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveHistory.setLeaveType(LeaveType.valueOf(rs.getString("LEAVE_TYPE")));
			leaveHistory.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
			leaveHistory.setLeaveReason(rs.getString("LEAVE_REASON"));
			listLeaveHistory.add(leaveHistory);
		}
		return listLeaveHistory;
	}

}
