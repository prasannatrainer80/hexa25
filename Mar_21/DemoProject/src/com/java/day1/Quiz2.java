package com.java.day1;

public class Quiz2 {

	public static void main(String[] args) {
		String str = "sam";
		int a=10, b= 20, c = 30;
		System.out.println(a+b+str+c); //30sam30
		System.out.println(str+a+b+c); // sam102030
		System.out.println(a+b+c+str); // 60sam
	}
}
