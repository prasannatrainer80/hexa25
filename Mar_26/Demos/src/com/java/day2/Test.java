package com.java.day2;

public class Test {

	static {
		System.out.println("Static Constructor...");
	}
	
	Test() {
		System.out.println("Instance Constructor...");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
	}
}
