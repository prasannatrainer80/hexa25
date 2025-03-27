package com.java.props;

class Vendor {
	
	private int vid;
	private String vname;
	
	public void setVid(int vid) {
		this.vid = vid;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + "]";
	}
}

public class ProEx2 {
	public static void main(String[] args) {
		Vendor vendor = new Vendor();
		vendor.setVid(1);
		vendor.setVname("Alchemy");
		System.out.println(vendor);
	}
}
