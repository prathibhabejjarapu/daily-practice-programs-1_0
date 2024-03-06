package com.daily.practice.feb21.string.programs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SwapTwoStringsTest {
	private SwapTwoStrings sw;

	@Before
	public void setUp() {
		sw = new SwapTwoStrings();
	}

	@Test
	public void testCaseForSwap() {

		String result = sw.swap("Hello", "Hi");
		Assert.assertEquals("Hello", result);
	}

	@Test
	public void testCaseForSwap2() {
		String result2 = sw.swap2("usa", "india");
		Assert.assertEquals("india", result2);

	}
}
