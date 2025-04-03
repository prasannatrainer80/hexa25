package com.java.lms.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.lms.model.LeaveHistory;

public interface LeaveHistoryDao {

	String applyLeave(LeaveHistory leaveHistory) throws ClassNotFoundException, SQLException;
	LeaveHistory searchByLeaveId(int leaveId) throws ClassNotFoundException, SQLException;
	List<LeaveHistory> showLeaveHistory(int empId) throws ClassNotFoundException, SQLException;
}
