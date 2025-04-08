package com.java.junit;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

  public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails ld1 = new LeaveDetails(1, 1000, sdf.parse("2020-10-10"), 
				sdf.parse("2020-10-11"), "Sick", LeaveStatus.PENDING, LeaveType.EL);
		System.out.println(ld1);
  }

}
