package com.java.day1;

import java.util.Scanner;

/**
 * Program to Calculate Area and circ. of circle
 */

public class CircleProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius;
		System.out.println("Enter Radius  ");
		radius = sc.nextDouble();
		double area, circ;
		area = 3.14 * radius * radius;
		circ = 2 * 3.14 * radius;
		System.out.println("Area of Circle  " +area);
		System.out.println("Circumference  " +circ);
	}
}
