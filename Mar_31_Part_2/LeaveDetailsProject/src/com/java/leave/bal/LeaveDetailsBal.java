package com.java.leave.bal;

import java.util.Date;
import java.util.List;

import com.java.leave.dao.LeaveDetailsDao;
import com.java.leave.dao.LeaveDetailsDaoImpl;
import com.java.leave.exception.LeaveDetailsException;
import com.java.leave.model.LeaveDetails;

public class LeaveDetailsBal {

	static LeaveDetailsDao leaveDetailsDao;
	static StringBuilder sb;
	
	static {
		leaveDetailsDao = new LeaveDetailsDaoImpl();
		sb = new StringBuilder();
	}
	
	public long dateDiff(Date startDate, Date endDate) {
		long ms = endDate.getTime() - startDate.getTime();
		long days = (ms / (1000 * 60 * 60 * 24));
		return days;
	}
	
	public List<LeaveDetails> showLeaveDetailsBal() {
		return leaveDetailsDao.showLeaveDetailsDao();
	}
	
	public LeaveDetails searchLeaveDetailsBal(int leaveId) {
		return leaveDetailsDao.searchByLeaveDetailsDao(leaveId);
	}
	
	public String addLeaveDetailsBal(LeaveDetails leaveDetails) throws LeaveDetailsException {
		boolean isValid = true;
		Date today = new Date();
		long diff = dateDiff(today,leaveDetails.getLeaveStartDate());
		if (diff < 0) {
			sb.append("Leave-Start Date Cannot be Yesterday...");
			isValid = false;
		}
		diff = dateDiff(today,leaveDetails.getLeaveEndDate());
		if (diff < 0) {
			sb.append("Leave-End Date Cannot be Yesterday...");
			isValid = false;
		}
		
		diff = dateDiff(leaveDetails.getLeaveStartDate(), leaveDetails.getLeaveEndDate());
		if (diff < 0) {
			sb.append("Leave-Start Date Cannot be Greater than Leave-End Date...");
			isValid = false;
		}
		if (isValid == true) {
			diff++;
			leaveDetails.setNoOfDays((int)diff);
			return leaveDetailsDao.addLeaveDetailsDao(leaveDetails);
		}
		throw new LeaveDetailsException(sb.toString());
	}
}
