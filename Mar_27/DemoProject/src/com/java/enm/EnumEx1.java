package com.java.enm;

enum WeekDays {
	SUNDAY, 
	MONDAY, 
	TUESDAY, 
	WEDNESDAY, 
	THURSDAY, 
	FRIDAY, 
	SATURDAY
}

public class EnumEx1 {
	public static void main(String[] args) {
		WeekDays weekDays = WeekDays.THURSDAY;
		System.out.println(weekDays);
	}
}
