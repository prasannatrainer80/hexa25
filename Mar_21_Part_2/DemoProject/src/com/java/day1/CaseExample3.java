package com.java.day1;

import java.util.Scanner;

public class CaseExample3 {

	public static void main(String[] args) {
		String choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice char/number/alphbet ");
		choice = sc.next();
		char ch = choice.charAt(0);
		switch(ch) {
		case '1' :
		case 'A' : 
		case 'a' : 
		case 'I' : 
			System.out.println("Grade A...");
			break;
		case '2' :
		case 'B' :
		case 'b' :
			System.out.println("Grade B...");
			break;
		case '3' :
		case 'C' : 
		case 'c' : 
			System.out.println("Grade C...");
			break;
		default : 
			System.out.println("Invalid Choice...");
		}
	}
}
