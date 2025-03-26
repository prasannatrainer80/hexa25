package com.java.day2;

public class Emp {

	int empno;
	String name;
	double basic;
	
	public Emp() {

	}

	public Emp(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	public static void main(String[] args) {
		Emp emp1 = new Emp(1, "Addlin", 88234);
		Emp emp2 = new Emp(2, "Harsha", 88662);
		
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
