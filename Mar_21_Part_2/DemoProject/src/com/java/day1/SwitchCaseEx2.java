package com.java.day1;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public void show(String dayName) {
		switch(dayName) {
		case "sunday" : 
				System.out.println("Its Sunday...");
				break;
		case "monday" : 
				System.out.println("Its Monday...Working Day...");
				break;
		case "tuesday" : 
				System.out.println("Its Tuesday...");
				break;
		case "wednesday" : 
			System.out.println("Its Wednesday...");
			break;
		case "thursday" : 
			System.out.println("Its Thursday...");
			break;
		case "friday" : 
			System.out.println("Its Friday...");
			break;
		case "saturday" : 
			System.out.println("Its Saturday...");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day Name ");
		String dayName=sc.next();
		
		SwitchCaseEx2 obj = new SwitchCaseEx2();
		obj.show(dayName);
	}
}
