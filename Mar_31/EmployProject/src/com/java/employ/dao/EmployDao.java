package com.java.employ.dao;

import java.util.List;

import com.java.employ.model.Employ;

public interface EmployDao {

	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String addEmployDao(Employ employ);
}
