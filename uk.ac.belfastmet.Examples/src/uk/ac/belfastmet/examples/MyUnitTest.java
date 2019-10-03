package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("one",  "two");
		
		assertEquals("onetwo", result);
	}
	@Test
	public void testConcatenate34() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("three",  "four");
		
		assertEquals("threefour", result);
	}
}
