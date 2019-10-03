package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public void testTemperature() {
		Temperature temperature = new Temperature();
	
		boolean result = temperature.icyHot(120,  -1);//true
		
		assertEquals(true, result);
	}
	@Test
	public void testTemperature1() {
		Temperature temperature = new Temperature();
	
		boolean result = temperature.icyHot(-1, 120);//true
		
		assertEquals(true, result);
	}
	@Test
	public void testTemperature2() {
		Temperature temperature = new Temperature();
	
		boolean result = temperature.icyHot(2,  120);//false
		
		assertEquals(false, result);
	}
}