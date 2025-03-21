package com.java.day1;

public class StrEx5 {

	public static void main(String[] args) {
		String str = "Arti,Christina,Devadarshini,Janarthan,Keerthana,Ajay,Hemanth";
		String[] names = str.split(",");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
