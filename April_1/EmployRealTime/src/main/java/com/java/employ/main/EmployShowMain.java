package com.java.employ.main;

import java.sql.SQLException;
import java.util.List;

import com.java.employ.dao.EmployDao;
import com.java.employ.dao.EmployDaoImpl;
import com.java.employ.model.Employ;

public class EmployShowMain {

	public static void main(String[] args) {
		EmployDao dao = new EmployDaoImpl();
		try {
			List<Employ> employList = dao.showEmployDao();
			for (Employ employ : employList) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
