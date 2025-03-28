package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortEx {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Janarthan");
		names.add("Ayush");
		names.add("Bala");
		names.add("Keerthana");
		names.add("Anuvarshini");
		names.add("Hemanth");
		names.add("Charuhasini");
		
		Collections.sort(names);
		System.out.println("Sorted Data  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
