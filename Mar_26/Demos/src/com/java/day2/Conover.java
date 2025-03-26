package com.java.day2;

public class Conover {

	int a,b;
	
	Conover() {
		a = 5;
		b = 7;
	}
	
	Conover(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Conover [a=" + a + ", b=" + b + "]";
	}

	public static void main(String[] args) {
		Conover obj1 = new Conover();
		System.out.println(obj1);
		Conover obj2 = new Conover(88, 42);
		System.out.println(obj2);
	}
}
