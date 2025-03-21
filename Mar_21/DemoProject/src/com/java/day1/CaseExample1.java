package com.java.day1;

import java.util.Scanner;

public class CaseExample1 {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice   ");
		choice = sc.nextInt();
		switch(choice) {
		case 1 : 
			System.out.println("Hi I am Bala...");
			break;
		case 2 : 
			System.out.println("Hi I am Charuhasini...");
			break;
		case 3 : 
			System.out.println("Hi I Am Hemanth...");
			break;
		case 4 : 
			System.out.println("Hi I am Anuvarshini");
			break;
		default : 
			System.out.println("Invalid Choice");
		}
	}
}
