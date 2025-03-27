package com.java.props;

/**
 * Example for Read-Only Properties
 */

class Demo {
	
	private int sno;
	private String name;
	
	public Demo(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}
	
}

public class PropEx {
	public static void main(String[] args) {
		Demo demo1 = new Demo(1, "Raj");
		System.out.println("Sno  " +demo1.getSno());
		System.out.println("Name  " +demo1.getName());
	}
}
