package com.java.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataTest {

	static Data data;
	
	@Before
	public void beforeMethod() {
		System.out.println("Test Case is Running...");
	}
	
	@After
	public void afterMethod() {
		System.out.println("Test Case Executed Completed...");
	}
	
	@BeforeClass
	public static void setUp() {
		data = new Data();
		System.out.println("BeforeClass Method Fired...");
	}
	
	@AfterClass 
	public static void cleanUp() {
		data = null;
		System.out.println("AfterClass Method Fired...");
	}
	
	@Test 
	public void testNullCheck() {
		Data data1 = null;
		assertNull(data1);
		Data data2 = new Data();
		assertNotNull(data2);
	}
	
	@Test
	public void testPosNeg() {
//		Data data = new Data();
		assertTrue(data.posNeg(4));
		assertFalse(data.posNeg(-4));
	}
	
	@Test
	public void testEvenOdd() {
//		Data data = new Data();
		assertTrue(data.evenOdd(4));
		assertFalse(data.evenOdd(5));
	}
	
	@Test
	public void testArrayEquals() {
		int[] a= new int[] {1,2,3,4};
		int[] b = new int[] {1,2,3,4};
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testMax3() {
//		Data data = new Data();
		assertEquals(7, data.max3(7, 2, 3));
		assertEquals(7, data.max3(2, 7, 3));
		assertEquals(7, data.max3(2, 3, 7));
	}
	
	@Test
	public void testSum() {
//		Data data = new Data();
		assertEquals(5, data.sum(2, 3));
	}
	
	@Test
	public void testSayHello() {
//		Data data = new Data();
		assertEquals("Welcome to Java Programming...", data.sayHello());
	}

}
