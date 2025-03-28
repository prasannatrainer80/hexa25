package com.java.gen;

class Demo<T> {
	
	public void show(T x) {
		System.out.println("X value is  " +x);
	}
	
}

public class GenEx1 {

	public static void main(String[] args) {
		Demo demo = new Demo();
		int x=12;
		demo.show(x);
		String str = "Hello";
		demo.show(str);
		boolean flag = true;
		demo.show(flag);
		double b1 =12.4;
		demo.show(b1);
	}
}
