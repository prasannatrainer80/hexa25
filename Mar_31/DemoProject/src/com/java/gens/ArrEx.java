package com.java.gens;

public class ArrEx {

	public static void main(String[] args) {
		int[] a = new int[] {12,5};
		try {
			a[10]=88;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array Size is Small...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
