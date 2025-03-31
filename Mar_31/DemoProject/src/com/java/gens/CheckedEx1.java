package com.java.gens;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckedEx1 {

	public void show(String strDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(strDate);
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strDate;
		System.out.println("Enter Date (yyyy-MM-dd) format  ");
		strDate = sc.next();
		CheckedEx1 obj = new CheckedEx1();
		try {
			obj.show(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
