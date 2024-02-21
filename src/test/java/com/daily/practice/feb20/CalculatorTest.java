package com.daily.practice.feb20;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;

	@Before
	public void setUp() {
		calc = new Calculator();
	}

	@Test
	public void testCaseForAdd() {
		int result = calc.add(12, 343);
		Assert.assertEquals(355, result);
	}

}
