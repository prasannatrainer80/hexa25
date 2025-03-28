package com.java.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
//		Comparator<Employ> c = new NameComparator();
		Comparator<Employ> c = new BasicComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1, "Gopal", 99224.22));
		employList.add(new Employ(2, "Janarthan", 90022.22));
		employList.add(new Employ(3, "Keerthana", 88822.22));
		employList.add(new Employ(4, "Dhanasree", 91153.22));
		employList.add(new Employ(5, "Harshavardhan", 90088.22));
		
		System.out.println("Sorted Data ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
