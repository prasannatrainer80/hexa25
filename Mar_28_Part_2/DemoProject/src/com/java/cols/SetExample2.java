package com.java.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
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
