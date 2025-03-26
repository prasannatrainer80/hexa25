package com.java.day2;

public class BoxEx {

	public void show(Object ob) {
		if (ob instanceof Integer) {
			int x = (Integer)ob;
			System.out.println("Integer Casting  " +x);
		}
		
		if (ob instanceof String) {
			String x = (String)ob;
			System.out.println("String Casting  " +x);
		}
		
		if (ob instanceof Double) {
			double x = (Double)ob;
			System.out.println("Double Casting  " +x);
		}
	}
	
	public static void main(String[] args) {
		int a = 12;
		String str = "Hello";
		double b = 12.5;
		
		BoxEx obj = new BoxEx();
		obj.show(a);
		obj.show(str);
		obj.show(b);
	}
}
