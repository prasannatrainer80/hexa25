package com.java.lms.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor
@ToString
public class Employee {

	private int empId;
	private String empName;
	private String empEmail;
	private String empMobNo;
	private Date empDtJoin;
	private String empDept;
	private int empManagerId;
	private int empAvailLeaveBal;
	
	
}
