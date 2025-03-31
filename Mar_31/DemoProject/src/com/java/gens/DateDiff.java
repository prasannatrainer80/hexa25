package com.java.gens;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDiff {

	public void calc(String strDate1, String strDate2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(strDate1);
		Date date2 = sdf.parse(strDate2);
		long ms = date2.getTime() - date1.getTime(); // returns data in milliseconds 
		long days =(ms/ (1000 * 60 * 60 * 24));
		days++;
		System.out.println("Diff Between Days  " +days);
	}
	public static void main(String[] args) {
		String strDate1, strDate2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Date (yyyy-MM-dd)   ");
		strDate1 = sc.next();
		System.out.println("Enter Ending Date (yyyy-MM-dd)   ");
		strDate2 = sc.next();
		DateDiff dateDiff = new DateDiff();
		try {
			dateDiff.calc(strDate1, strDate2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
