package com.java.day2;

public class BoxingExample {

	public static void main(String[] args) {
		
		int x = 12;
		String str = "Hello";
		double b1 = 12.5;
		
		/* Implement Boxing */ 
		
		Object obj1 = x;
		Object obj2 = str;
		Object obj3 = b1;
		
		/* Implement Unboxing */ 
		
		int x1 = (Integer)obj1;
		String s1 = (String)obj2;
		double d1 = (Double)obj3;
		
		System.out.println("X1 Value  " +x1);
		System.out.println("String Value  " +s1);
		System.out.println("Double Value  " +d1);
	}
}
