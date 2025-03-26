package com.java.day2;

public class BoxTest {

	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
//		System.out.println(type);
		if (type.equals("Integer")) {
			int x = (Integer)ob;
			System.out.println("Integer Casting  " +x);
		}
		
		if (type.equals("String")) {
			String x = (String)ob;
			System.out.println("String Casting  " +x);
		}
		
		if (type.equals("Double")) {
			double x = (Double)ob;
			System.out.println("Double Casting  " +x);
		}
	}
	
	public static void main(String[] args) {
		int a = 12;
		String str = "Hello";
		double b = 12.5;
		
		BoxTest obj = new BoxTest();
		obj.show(a);
		obj.show(str);
		obj.show(b);
	}
}
