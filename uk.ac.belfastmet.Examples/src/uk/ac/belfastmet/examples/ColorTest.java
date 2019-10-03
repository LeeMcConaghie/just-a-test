package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorTest {

	@Test
	public void test() {
		Color color = new Color();
		String outcome = color.seeColor("redxx");
		assertEquals("red", outcome);
	}
	@Test
	public void test1() {
		Color color = new Color();
		String outcome = color.seeColor("xxred");
		assertEquals("", outcome);
	}
	@Test
	public void test2() {
		Color color = new Color();
		String outcome = color.seeColor("blueTimes");
		assertEquals("blue", outcome);
	}
	@Test
	public void test3() {
		Color color = new Color();
		String outcome = color.seeColor("");
		assertEquals("", outcome);
	}
}
