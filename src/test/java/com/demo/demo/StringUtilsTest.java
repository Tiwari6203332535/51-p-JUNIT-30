package com.demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	private StringUtils su = new StringUtils();

	@Test
	public void testStringToInt1() {
		Integer actual = su.StringToInt("123");
		assertEquals(123, actual);
	}

	@Test
	public void testStringToInt2() {

		assertThrows(IllegalArgumentException.class, () -> su.StringToInt(null));
	}

	@Test
	public void testStringToInt3() {

		assertThrows(IllegalArgumentException.class, () -> su.StringToInt(""));
	}

}
