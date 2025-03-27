package com.java.sup;

class Demo {
	
	public void show() {
		System.out.println("Show Method from Class First...");
	}
}

class Test extends Demo {
	
	public void show() {
		super.show();
		System.out.println("Show Method from Class Second...");
	}
}


public class SuperEx {
	public static void main(String[] args) {
		Test test = new Test();
		test.show();
	}
}
