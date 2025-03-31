package com.java.gens;

import java.util.Scanner;

public class Voting {

	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are not Authorized for Voting...");
		}
		System.out.println("You Can Vote...");
	}
	
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age   ");
		age = sc.nextInt();
		Voting voting = new Voting();
		try {
			voting.check(age);
		} catch (VotingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
