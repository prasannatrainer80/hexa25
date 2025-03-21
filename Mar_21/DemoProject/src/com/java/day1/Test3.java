package com.java.day1;

public class Test3 {

	public static void main(String[] args) {
		int x=3;
		int y = x++ + ++x + ++x + x++;
		// A  3   5   6   6
		// M  4   5   6   7
		System.out.println(y);
	}
}
