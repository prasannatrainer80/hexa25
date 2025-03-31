package com.java.gens;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter a Number  ");
		try {
			x = sc.nextInt();
			System.out.println("X value  " +x);
		} catch (InputMismatchException e) {
			System.err.println("Please Enter Integers Only...");
		} catch (Exception e) {
			e.printStackTrace();
		} 	finally {
		  sc.close();
		}
	}
}
