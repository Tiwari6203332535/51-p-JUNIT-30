package com.demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void addtest() {
		Calcuator c = new Calcuator();
		int actualresult = c.add(1, 5);
		int excpetedResult =6;
		assertEquals(excpetedResult, actualresult);
	}
	@Test
	public void testMultiply() {
		Calcuator c = new Calcuator();
		int actualresult = c.multiply(3, 3);
		int excpetedResult =10;
		assertEquals(excpetedResult, actualresult);
	}

}
