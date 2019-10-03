package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBalancedBrackets {

	@Test
	public void test() {
		
			BalancedBrackets balancedBrackets = new BalancedBrackets();
			boolean outcome = balanacedBrackets("[()]");
			
			assertEquals(true, outcome);
	}

}
