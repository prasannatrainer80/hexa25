package com.java.abs;

public class AbsEx1 {
	
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Ayush(),
			new Janardhan(),
			new Keerthana()
		};
		
		for (Training training : arr) {
			training.name();
			training.email();
		}
	}
	
}
