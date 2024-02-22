package com.daily.practice.feb21.factorial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialProgramTest {
	private FactorialProgram fp;

	@Before
	public void setUp() {
		fp = new FactorialProgram();
	}

	@Test
	public void testCaseForFact() {
		int number = 10;
		long num = fp.fact(number);
		Assert.assertEquals(3628800, num);
	}
}
