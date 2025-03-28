package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEmployEx {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Gopal", 99224.22));
		employList.add(new Employ(2, "Janarthan", 90022.22));
		employList.add(new Employ(3, "Keerthana", 88822.22));
		employList.add(new Employ(4, "Dhanasree", 91153.22));
		employList.add(new Employ(5, "Harshavardhan", 90088.22));
		System.out.println("Employ Records are  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
