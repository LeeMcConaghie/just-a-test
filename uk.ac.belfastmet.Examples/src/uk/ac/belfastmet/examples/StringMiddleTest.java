package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringMiddleTest {

	@Test
	public void testMiddletwo() {
		StringMiddle stringMiddle = new StringMiddle();
		
		stringMiddle.middletwo("String");
		
		String result = stringMiddle.middletwo("String");
		
		assertEquals("ri", result);
		System.out.println(result);
	}

}
