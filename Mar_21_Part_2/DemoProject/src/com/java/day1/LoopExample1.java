package com.java.day1;

public class LoopExample1 {

	public void show() {
		int i=0;
		int count = 10;
		while(i < count) {
			System.out.println("Welcome to Java...");
			i++;
		}
	}
	public static void main(String[] args) {
		LoopExample1 obj = new LoopExample1();
		obj.show();
	}
}
