package com.java.day1;

import java.util.Scanner;

public class Calculation {

	public void calc(int a, int b) {
		int c = a + b;
		System.out.println("Sum is  " +c);
		c = a - b;
		System.out.println("Sub is  " +c);
		c = a * b;
		System.out.println("Mult is  " +c);
	}
	
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers   ");
		a = sc.nextInt();
		b = sc.nextInt();
		Calculation calculation = new Calculation();
		calculation.calc(a, b);
	}
}
