package com.java.props;

class Employ {
	
	private int empno;
	private String name;
	private double basic;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
}

public class PropEx3 {
	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.setEmpno(1);
		employ1.setName("Kishore");
		employ1.setBasic(99923.33);
		
		System.out.println("Employ No   " +employ1.getEmpno());
		System.out.println("Employ Name  " +employ1.getName());
		System.out.println("Salary  " +employ1.getBasic());
	}
}
