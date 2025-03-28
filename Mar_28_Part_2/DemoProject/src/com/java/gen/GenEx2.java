package com.java.gen;

class Data<T,V> {
	
	T t;
	V v;
	
	public Data(T t, V v) {
		super();
		this.t = t;
		this.v = v;
	}
	
	@Override
	public String toString() {
		return "Data [t=" + t + ", v=" + v + "]";
	}
	
}

public class GenEx2 {

	public static void main(String[] args) {
		Data<Integer, String> data1 = new Data(1, "Java");
		System.out.println(data1);
		Data<String, Double> data2 = new Data("Hemanth", 99992.22);
		System.out.println(data2);
	}
}
