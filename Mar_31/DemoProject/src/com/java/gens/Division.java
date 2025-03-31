package com.java.gens;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers   ");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division Value   " +c);
		} catch (InputMismatchException e) {
			System.err.println("String Cannot be Converted as Integer...");
		} catch (ArithmeticException e) {
			System.err.println("Division By Zero Impossible...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program from Hexa Batch 1...");
		}
	}
}
