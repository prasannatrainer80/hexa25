package com.java.day1;

import java.util.Scanner;

public class FactSer {

	public void show(int n) {
		int f = 1;
		for(int i=1;i<=n;i++) {
			f = f * i;
			System.out.println("Factorial Value is  " +f);
		}
		
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		FactSer obj = new FactSer();
		obj.show(n);
	}
}
