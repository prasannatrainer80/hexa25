package com.java.day2;

public class Employ {

	int empno;
	String name;
	double basic;
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.empno = 1;
		e1.name = "Bala";
		e1.basic = 88234;
		
		Employ e2 = new Employ();
		e2.empno =2;
		e2.name = "Anu";
		e2.basic = 88622;
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
