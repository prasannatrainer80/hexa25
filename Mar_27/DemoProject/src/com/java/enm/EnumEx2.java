package com.java.enm;

import java.util.Scanner;

enum OrderStatus {
	PENDING,
	ACCEPTED,
	REJECTED
}

public class EnumEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Order Status  ");
		String ordStatus = sc.next();
		OrderStatus status = OrderStatus.valueOf(ordStatus);
		System.out.println(status);
	}
}
