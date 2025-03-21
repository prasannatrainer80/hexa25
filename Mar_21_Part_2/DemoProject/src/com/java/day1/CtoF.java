package com.java.day1;

import java.util.Scanner;

/**
 * Program to convert Celsius to Fahrenheit 
 */

public class CtoF {

	public static void main(String[] args) {
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celsius Value  ");
		c = sc.nextDouble();
		double f = ((9 * c)/5) + 32;
		System.out.println("Fahrenheit Value  " +f);
	}
}
