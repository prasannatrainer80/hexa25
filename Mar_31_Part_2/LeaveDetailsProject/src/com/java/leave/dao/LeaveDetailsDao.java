package com.java.leave.dao;

import java.util.List;

import com.java.leave.model.LeaveDetails;

public interface LeaveDetailsDao {

	List<LeaveDetails> showLeaveDetailsDao();
	LeaveDetails searchByLeaveDetailsDao(int leaveId);
	String addLeaveDetailsDao(LeaveDetails leaveDetails);
}
