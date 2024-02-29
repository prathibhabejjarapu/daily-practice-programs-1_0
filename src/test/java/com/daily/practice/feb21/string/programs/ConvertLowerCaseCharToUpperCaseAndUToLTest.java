package com.daily.practice.feb21.string.programs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConvertLowerCaseCharToUpperCaseAndUToLTest {
	private ConvertLowerCaseCharToUpperCaseAndUToL ch;

	@Before
	public void setUp() {
		ch = new ConvertLowerCaseCharToUpperCaseAndUToL();
	}

	@Test
	public void testCaseForconvertOpposite() {
		String name = "PrAthibha*thota";
		String result = ch.convertOpposite(name);
		Assert.assertEquals("ATOHT*AHBIHTaRp", result);
		// TODO:convert only lower to upper and vice versa
		// TODO:implement the same in reverse order
	}
}
