package com.demo.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeCheck {
	@ParameterizedTest
	@ValueSource(strings = { "liril", "madam", "racecar", "happy" })
	public void testISPallindrome(String str) {
		PalindreomeCheck pc = new PalindreomeCheck();

		boolean actual = pc.isPallindrome(str);
		assertTrue(actual);
	}

}
