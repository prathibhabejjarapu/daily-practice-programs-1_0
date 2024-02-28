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
	String	convert = "Prathibha";
		 convert= ch.convertOpposite(convert);
		Assert.assertEquals("pRATHIBHA", convert);
	}
}
