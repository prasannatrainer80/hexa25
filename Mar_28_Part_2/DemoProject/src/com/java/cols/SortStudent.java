package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
//		Comparator c = new StudentNameComparator();
		Comparator c = new CgpComparator();
		SortedSet students = new TreeSet(c);
		students.add(new Student(1, "Charuhasini", "Chennai", 9.2));
		students.add(new Student(2, "Ayush", "Delhi", 8.9));
		students.add(new Student(3, "Keerthana", "Pune", 9.8));
		students.add(new Student(4, "Janarthan", "Chennai", 8.7));
		students.add(new Student(5, "Subhasree", "Delhi", 8.6));
		
		System.out.println("Sorted Data  ");
		for (Object object : students) {
			Student student = (Student)object;
			System.out.println(student);
		}
		
	}
}
