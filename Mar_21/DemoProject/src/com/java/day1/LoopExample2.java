package com.java.day1;

import java.util.Scanner;

public class LoopExample2 {

	public void show(int n) {
		int i=0;
		while(i < n) {
			i+=2;
			System.out.println("Even  " +i);
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		LoopExample2 obj = new LoopExample2();
		obj.show(n);
	}
}
