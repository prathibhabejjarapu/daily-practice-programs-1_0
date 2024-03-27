package com.daily.practice.march27.number.programs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerProgramTest {
	private PowerProgram pow;

	@Before
	public void setUp() {
		pow = new PowerProgram();
	}

	@Test
	public void testCaseForPower() {
		int result = pow.power(2, 0);
		Assert.assertEquals(1, result);
	}
}
