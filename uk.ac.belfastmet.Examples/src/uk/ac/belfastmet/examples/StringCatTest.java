package uk.ac.belfastmet.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCatTest {
	
	@Test
	public String Concatenate() {
	String result = StringCat.Concatenate("putain", "de merde");
	
	
	
	assertEquals("putain de merde", result);
	System.out.println(result);
	return result;
	
	}
	/**
	 * No idea
	 */
}
