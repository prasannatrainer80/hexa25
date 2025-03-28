package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

	public static void main(String[] args) {
		Set names = new HashSet();
		names.add("Janarthan");
		names.add("Ayush");
		names.add("Bala");
		names.add("Janarthan");
		names.add("Ayush");
		names.add("Bala");
		names.add("Keerthana");
		names.add("Anuvarshini");
		names.add("Janarthan");
		names.add("Ayush");
		names.add("Bala");
		names.add("Keerthana");
		names.add("Anuvarshini");
		names.add("Hemanth");
		names.add("Charuhasini");
		names.add("Hemanth");
		names.add("Charuhasini");
		names.add("Keerthana");
		names.add("Anuvarshini");
		names.add("Hemanth");
		names.add("Charuhasini");
		names.add("Janarthan");
		names.add("Ayush");
		names.add("Bala");
		names.add("Keerthana");
		names.add("Anuvarshini");
		names.add("Hemanth");
		names.add("Charuhasini");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
