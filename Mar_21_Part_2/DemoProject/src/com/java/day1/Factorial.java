package com.java.day1;

import java.util.Scanner;

public class Factorial {

	public void calc(int n) {
		int f=1;
		int i=1;
		while(i <= n) {
			f = f * i;
			i++;
		}
		System.out.println("Factorial Value  " +f);
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		Factorial obj = new Factorial();
		obj.calc(n);
	}
}
