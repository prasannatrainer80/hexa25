package com.java.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.model.Employ;

public class EmployDaoImpl implements EmployDao {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	@Override
	public List<Employ> showEmployDao() {
		return employList;
	}

	@Override
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}

	@Override
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno() == empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}

}
