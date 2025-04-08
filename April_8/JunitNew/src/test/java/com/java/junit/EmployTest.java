package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testToString() {
		Employ employ2 = new Employ(1, "Harsh", Gender.MALE, "Java", "Programmer", 99922.22);
		String result = "Employ [empno=1, name=Harsh, gender=MALE, dept=Java, desig=Programmer, basic=99922.22]";
		assertEquals(result, employ2.toString());
	}
	
	@Test
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Christina");
		employ.setGender(Gender.FEMALE);
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setBasic(99992.22);
		
		assertEquals(1, employ.getEmpno());
		assertEquals("Christina", employ.getName());
		assertEquals(Gender.FEMALE, employ.getGender());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals(99992.22, employ.getBasic(), 2);
	}
	
	@Test
	public void testConstructor() {
		Employ employ1 = new Employ();
		assertNotNull(employ1);
		Employ employ2 = new Employ(1, "Harsh", Gender.MALE, "Java", "Programmer", 99922.22);
		assertEquals(1, employ2.getEmpno());
		assertEquals("Harsh", employ2.getName());
		assertEquals(Gender.MALE, employ2.getGender());
		assertEquals("Java", employ2.getDept());
		assertEquals("Programmer", employ2.getDesig());
		assertEquals(99922.22, employ2.getBasic(), 2);
	}

}
