package com.java.day1;

public class ArrayEx1 {

	public void show() {
		int[] a = new int[] {12,53,23,65,13};
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ArrayEx1 obj = new ArrayEx1();
		obj.show();
	}
}
