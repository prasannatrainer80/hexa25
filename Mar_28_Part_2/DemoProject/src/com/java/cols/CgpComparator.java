package com.java.cols;

import java.util.Comparator;

public class CgpComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student student1 = (Student)o1;
		Student student2 = (Student)o2;
		if (student1.getCgp() >= student2.getCgp()) {
			return 1;
		}
		return -1;
	}

}
