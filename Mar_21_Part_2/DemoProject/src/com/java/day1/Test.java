package com.java.day1;

public class Test {

	int n;
	public static void main(String[] args) {
		Test obj1 = new Test();
		obj1.n = 12;
		Test obj2 = obj1;
		obj2.n = 13;
		System.out.println(obj1.n);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
