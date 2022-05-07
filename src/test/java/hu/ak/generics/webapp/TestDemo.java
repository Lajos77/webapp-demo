package hu.ak.generics.webapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestDemo {
	
	@Test
	public void testSucces() {
		assertTrue(3 == 3);
	}
	
	
	@Test
	@Disabled
	public void testFailure() {
		assertTrue(2 == 2);
	}
}
