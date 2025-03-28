package com.java.cols;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employ employ1 = (Employ)o1;
		Employ employ2 = (Employ)o2;
		return employ2.name.compareTo(employ1.name);
	}

}
