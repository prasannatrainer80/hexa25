package com.java.junit;

import java.util.Date;

public class LeaveDetails {

	private int leaveId;
	private int empId;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private String leaveReason;
	private LeaveStatus leaveStatus;
	private LeaveType leaveType;
	
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	public LeaveDetails() {

	}
	public LeaveDetails(int leaveId, int empId, Date leaveStartDate, Date leaveEndDate, String leaveReason,
			LeaveStatus leaveStatus, LeaveType leaveType) {
		this.leaveId = leaveId;
		this.empId = empId;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.leaveReason = leaveReason;
		this.leaveStatus = leaveStatus;
		this.leaveType = leaveType;
	}
	
	@Override
	public String toString() {
		return "LeaveDetails [leaveId=" + leaveId + ", empId=" + empId + ", leaveStartDate=" + leaveStartDate
				+ ", leaveEndDate=" + leaveEndDate + ", leaveReason=" + leaveReason + ", leaveStatus=" + leaveStatus
				+ ", leaveType=" + leaveType + "]";
	}
	
	
}
