package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class hasBadTest {

	@Test
	public void test() {
		Bad bad = new Bad();
		boolean outcome = bad.hasBad("badxx");
		
		assertEquals(true, outcome);
	}
	@Test
	public void test1() 
	{
		Bad bad = new Bad();
		boolean outcome = bad.hasBad("xbadxx");
		
		assertEquals(true, outcome);
	}
	@Test
	public void test2() 
	{
		Bad bad = new Bad();
		boolean outcome = bad.hasBad("xxbadxx");
		
		assertEquals(false, outcome);
	}
}
	
	