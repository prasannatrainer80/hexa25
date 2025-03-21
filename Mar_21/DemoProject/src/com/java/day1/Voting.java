package com.java.day1;

import java.util.Scanner;

public class Voting {

	public void check(int age) {
		if (age >= 18) {
			System.out.println("You are Elligible for Voting...");
		} else {
			System.out.println("You Cannot Vote...");
		}
	}
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age  ");
		age = sc.nextInt();
		Voting voting = new Voting();
		voting.check(age);
	}
}
