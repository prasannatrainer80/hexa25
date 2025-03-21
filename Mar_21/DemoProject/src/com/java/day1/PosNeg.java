package com.java.day1;

import java.util.Scanner;

public class PosNeg {

	public void check(int n) {
		if (n >= 0) {
			System.out.println("Positive Number...");
		} else {
			System.out.println("Negative Number...");
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		PosNeg posneg = new PosNeg();
		posneg.check(n);
	}
}
