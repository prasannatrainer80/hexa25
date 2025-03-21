package com.java.day1;

public class Test4 {

	public static void main(String[] args) {
		int x = 3;
		int y = x++ + ++x + ++x + x-- + --x;
		System.out.println(y);
	}
}
