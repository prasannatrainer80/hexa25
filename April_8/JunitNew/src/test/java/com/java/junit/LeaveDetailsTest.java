package com.java.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class LeaveDetailsTest {

	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails ld1 = new LeaveDetails(1, 1000, sdf.parse("2020-10-10"), 
				sdf.parse("2020-10-11"), "Sick", LeaveStatus.PENDING, LeaveType.EL);
		String result = "LeaveDetails [leaveId=1, empId=1000, leaveStartDate=Sat Oct 10 00:00:00 IST 2020, leaveEndDate=Sun Oct 11 00:00:00 IST 2020, "
				+ "leaveReason=Sick, leaveStatus=PENDING, leaveType=EL]";
		assertEquals(result, ld1.toString());
		
	}
	
	@Test
	public void testConstructor() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails leaveDetails = new LeaveDetails();
		assertNotNull(leaveDetails);
		LeaveDetails ld1 = new LeaveDetails(1, 1000, sdf.parse("2020-10-10"), 
				sdf.parse("2020-10-11"), "Sick", LeaveStatus.PENDING, LeaveType.EL);
		assertEquals(1, ld1.getLeaveId());
		assertEquals(1000, ld1.getEmpId());
		assertEquals("2020-10-10", sdf.format(ld1.getLeaveStartDate()));
		assertEquals("2020-10-11", sdf.format(ld1.getLeaveEndDate())); 
		assertEquals("Sick", ld1.getLeaveReason());
		assertEquals(LeaveStatus.PENDING, ld1.getLeaveStatus());
		assertEquals(LeaveType.EL, ld1.getLeaveType());
	}
	
	@Test
	public void testGettersAndSetters() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails leaveDetails = new LeaveDetails();
		leaveDetails.setLeaveId(1);
		leaveDetails.setEmpId(1000);
		leaveDetails.setLeaveStartDate(sdf.parse("2020-10-10"));
		leaveDetails.setLeaveEndDate(sdf.parse("2020-10-11"));
		leaveDetails.setLeaveReason("Sick");
		leaveDetails.setLeaveType(LeaveType.EL);
		leaveDetails.setLeaveStatus(LeaveStatus.PENDING);
		
		assertEquals(1, leaveDetails.getLeaveId()); 
		assertEquals(1000, leaveDetails.getEmpId());
		assertEquals("2020-10-10", sdf.format(leaveDetails.getLeaveStartDate()));
		assertEquals("2020-10-11", sdf.format(leaveDetails.getLeaveEndDate())); 
		assertEquals("Sick", leaveDetails.getLeaveReason()); 
		assertEquals(LeaveType.EL, leaveDetails.getLeaveType());
		assertEquals(LeaveStatus.PENDING, leaveDetails.getLeaveStatus());
	}

}
