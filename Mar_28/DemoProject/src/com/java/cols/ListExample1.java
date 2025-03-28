package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Janarthan");
		names.add("Ayush");
		names.add("Bala");
		names.add("Keerthana");
		names.add("Anuvarshini");
		names.add("Hemanth");
		names.add("Charuhasini");
		
		System.out.println("Collection Data  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		
		names.add(3, "Aditi");
		System.out.println("List after Insert Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.remove("Bala");
		System.out.println("List after Remove Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
		names.set(1, "Ayush Tripathi");
		System.out.println("List after Update Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		
	}
}
