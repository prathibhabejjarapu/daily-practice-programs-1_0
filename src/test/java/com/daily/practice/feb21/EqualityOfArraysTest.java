package com.daily.practice.feb21;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.daily.practice.feb21.EqualityOfArrays;

public class EqualityOfArraysTest {
	
	
	private EqualityOfArrays eoa;
	
	@Before
	public void setUp() {
		eoa = new EqualityOfArrays();
	}
	
	@Test
	public void testCaseForAreTheseTwoArraysSame1() {
		int[] arrayOne = { 2, 5, 7, 9, 10 };
		int[] arrayTwo = { 2, 5, 7 };
		boolean result = eoa.areTheseTwoArraysSame(arrayOne, arrayTwo);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testCaseForAreTheseTwoArraysSame2() {
		int[] arrayOne = { 2, 5, 7 };
		int[] arrayTwo = { 2, 5, 7 };
		boolean result = eoa.areTheseTwoArraysSame(arrayOne, arrayTwo);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testCaseForAreTheseTwoArraysSame3() {
		int[] arrayOne = { 2, 5, 7 };
		int[] arrayTwo = { 2, 5, 8 };
		boolean result = eoa.areTheseTwoArraysSame(arrayOne, arrayTwo);
		Assert.assertFalse(result);
	}

}
