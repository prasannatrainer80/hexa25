package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEx3 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Janarthan");
		names.add("Ayush");
		names.add("Bala");
		names.add("Keerthana");
		names.add("Anuvarshini");
		names.add("Hemanth");
		names.add("Charuhasini");
//		names.add(12);
		System.out.println("Names are  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
