package com.java.gens;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample2 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Converted String is  " +sdf.format(date));
	}
}
