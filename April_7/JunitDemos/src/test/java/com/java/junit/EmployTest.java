package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testToString() {
		Employ employ1 = new Employ(1, "Arya", Gender.FEMALE, "Java", "Programmer", 77722.22);
		String result = "Employ [empno=1, name=Arya, gender=FEMALE, dept=Java, desig=Programmer, basic=77722.22]";
		assertEquals(result, employ1.toString());
	}
	
	@Test 
	public void testGettersAndSetters() {
		Employ employ = new Employ(); 
		employ.setEmpno(1);
		employ.setName("Ayush");
		employ.setGender(Gender.MALE);
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setBasic(99992.22);
		
		assertEquals(1, employ.getEmpno());
		assertEquals("Ayush", employ.getName());
		assertEquals(Gender.MALE, employ.getGender());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals(99992.22, employ.getBasic(), 2);
	}
	
	@Test
	public void testConstructor() {
		Employ employ = new Employ();
		assertNotNull(employ);
		Employ employ1 = new Employ(1, "Arya", Gender.FEMALE, "Java", "Programmer", 77722.22);
		assertEquals(1, employ1.getEmpno());
		assertEquals("Arya", employ1.getName());
		assertEquals(Gender.FEMALE, employ1.getGender());
		assertEquals("Java", employ1.getDept());
		assertEquals("Programmer", employ1.getDesig());
		assertEquals(77722.22, employ1.getBasic(),2);
	}

}
