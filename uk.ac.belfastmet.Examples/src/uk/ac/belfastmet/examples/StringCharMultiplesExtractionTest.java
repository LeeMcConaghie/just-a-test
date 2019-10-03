package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCharMultiplesExtractionTest {

	@Test
	public void testEveryNth1() {
		StringCharMultiplesExtraction stringCharMultiplesExtraction = new StringCharMultiplesExtraction();
		
		String result = stringCharMultiplesExtraction.everyNth("Miracle", 2);
		
		assertEquals("Mrce", result);
	}
	@Test
	public void testEveryNth11() {
		StringCharMultiplesExtraction stringCharMultiplesExtraction = new StringCharMultiplesExtraction();
		
		String result = stringCharMultiplesExtraction.everyNth("abcdefg", 2);
		
		assertEquals("aceg", result);
	}
	@Test
	public void testEveryNth() {
		StringCharMultiplesExtraction stringCharMultiplesExtraction = new StringCharMultiplesExtraction();
		
		String result = stringCharMultiplesExtraction.everyNth("abcdefg", 3);
		
		assertEquals("adg", result);
	}
	
}
