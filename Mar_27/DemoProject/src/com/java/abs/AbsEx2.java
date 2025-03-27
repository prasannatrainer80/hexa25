package com.java.abs;

public class AbsEx2 {

	public static void main(String[] args) {
		Animal[] arr = new Animal[] {
			new Lion(), new Crocodile(), new Cow()
		};
		
		for (Animal animal : arr) {
			animal.name();
			animal.type();
		}
	}
}
