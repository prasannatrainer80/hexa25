package com.java.sup;

class Employ {
	
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Anuvarshini extends Employ {

	public Anuvarshini(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Bala extends Employ {

	public Bala(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Karthik extends Employ {

	public Karthik(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class SupCon {

	public static void main(String[] args) {
		
//		Employ e1 = new Karthik(1, "Karthik", 99234.22);
//		Employ e2 = new Bala(2, "Bala", 99923.22);
//		Employ e3 = new Anuvarshini(3, "Anuvarshini", 99234.22);
		
		Employ[] arr = new Employ[] 
		{
				new Karthik(1, "Karthik", 99234.22),
				new Bala(2, "Bala", 99923.22),
				new Anuvarshini(3, "Anuvarshini", 99234.22)
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
