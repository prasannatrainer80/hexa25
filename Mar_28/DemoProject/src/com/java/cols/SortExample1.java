package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortExample1 {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Janarthan");
		names.add("Ayush");
		names.add("Bala");
		names.add("Keerthana");
		names.add("Anuvarshini");
		names.add("Hemanth");
		names.add("Charuhasini");
		
		System.out.println("Sorted Data  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
