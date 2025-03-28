package com.java.gen;

class Test<T> {
	
	public void swap(T x, T y) {
		T t;
		t = x;
		x = y;
		y = t;
		
		System.out.println("X value  " +x+ " Y value  " +y);
	}
}

public class SwapEx {

	public static void main(String[] args) {
		int x=12, y = 13;
		Test test = new Test();
		test.swap(x, y);
		
		String s1="Hemanth", s2="Bala";
		test.swap(s1, s2);
		
		boolean b1=true, b2=false;
		test.swap(b1, b2);
	}
}
