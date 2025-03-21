package com.java.day1;

public class ArrayEx2 {

	public void show() {
		String[] names = new String[] {
			"Aditi","Devadarshini","Harsh","Harshavardhan","Ameya",
			"Addlin"
		};
		
		for (String string : names) {
			System.out.println(string);
		}
	}
	public static void main(String[] args) {
		ArrayEx2 obj = new ArrayEx2();
		obj.show();
	}
}
