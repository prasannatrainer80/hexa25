package com.java.cols;

public class Student {

	private int sid;
	private String sname;
	private String city;
	private double cgp;
	
	public Student() {

	}

	public Student(int sid, String sname, String city, double cgp) {
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.cgp = cgp;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", cgp=" + cgp + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getCgp() {
		return cgp;
	}

	public void setCgp(double cgp) {
		this.cgp = cgp;
	}
	
	
}
