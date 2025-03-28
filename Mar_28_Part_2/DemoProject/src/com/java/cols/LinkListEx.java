package com.java.cols;

import java.util.LinkedList;

public class LinkListEx {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("Harshavardhan");
		linkedList.add("Anuvarshini");
		linkedList.add("Addlin");
		linkedList.add("AshaJanet");
		linkedList.add("Gopal");
		linkedList.add("Hemanth");
		
		linkedList.addFirst("Induja");
		linkedList.addLast("Subhasree");
		
		System.out.println("Linked List Data  ");
		for (Object object : linkedList) {
			System.out.println(object);
		}
	}
}
