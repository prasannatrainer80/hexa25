package com.java.day1;

public class StrExample {

	public static void main(String[] args) {
		String str = "Welcome to Java Programming...From Hexaware";
		System.out.println("Length is  " +str.length());
		System.out.println("First Occurrence of char 'o' is " +str.indexOf("o"));
		System.out.println("Char at 5th position  " +str.charAt(5));
		System.out.println("Upper Case String  " +str.toUpperCase());
		System.out.println("Lower Case String  " +str.toLowerCase());
		System.out.println("Replaced String  " +str.replace("Java", "J2EE"));
		String s1 = "Hemanth", s2 = "Anish", s3 = "Gopal", s4="Hemanth";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
	}
}
