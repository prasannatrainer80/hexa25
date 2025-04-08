package com.java.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class DataTest {

	@Test
	public void testNull() {
		Data data = new Data();
		assertNotNull(data);
		Data data1 = null;
		assertNull(data1);
	}
	
	@Test
	public void testPosNeg() {
		Data data = new Data();
		assertTrue(data.posNeg(5));
		assertFalse(data.posNeg(-5));
	}
	
	@Test
	public void testEvenOdd() {
		Data data = new Data();
		assertTrue(data.evenOdd(4));
		assertFalse(data.evenOdd(5));
	}
	
	@Test
	public void testArray() {
		int[] a = new int[] {12,5};
		int[] b = new int[] {12,5};
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testMax3() {
		Data data = new Data();
		assertEquals(7, data.max3(7, 5, 3));
		assertEquals(7, data.max3(5, 7, 3));
		assertEquals(7, data.max3(3, 5, 7));
	}
	
	@Test
	public void testSayHello() {
		Data data = new Data();
		assertEquals("Welcome to Java Programming...",data.sayHello());
	}

	@Test
	public void testSum() {
		Data data = new Data();
		assertEquals(5, data.sum(2, 3));
	}
}
