package com.java.leave.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.leave.model.LeaveDetails;

public class LeaveDetailsDaoImpl implements LeaveDetailsDao {

	static List<LeaveDetails> listLeaveDetails;
	
	static {
		listLeaveDetails = new ArrayList<LeaveDetails>();
	}
	
	@Override
	public List<LeaveDetails> showLeaveDetailsDao() {
		return listLeaveDetails;
	}

	@Override
	public LeaveDetails searchByLeaveDetailsDao(int leaveId) {
		LeaveDetails leaveDetailsFound = null;
		for (LeaveDetails leaveDetails : listLeaveDetails) {
			if (leaveDetails.getLeaveId() == leaveId) {
				leaveDetailsFound = leaveDetails;
				break;
			}
		}
		return leaveDetailsFound;
	}

	@Override
	public String addLeaveDetailsDao(LeaveDetails leaveDetails) {
		listLeaveDetails.add(leaveDetails);
		return "Leave Records Inserted Successfully...";
	}

}
