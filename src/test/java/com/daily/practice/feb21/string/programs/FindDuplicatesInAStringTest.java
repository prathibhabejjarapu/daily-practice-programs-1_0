package com.daily.practice.feb21.string.programs;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindDuplicatesInAStringTest {
	private FindDuplicatesInAString duplicate;

	@Before
	public void setUp() {
		duplicate = new FindDuplicatesInAString();
	}

	@Test
	public void testCaseForfindDuplicateCharsInAString() {
		String input = "prathibha vinay sriyanvi";
		Map<Character, Integer> map = duplicate.findDuplicateCharsInAString(input);

		Assert.assertEquals(1, map.get('p').intValue());
		Assert.assertEquals(4, map.get('a').intValue());
		Assert.assertEquals(2, map.get('r').intValue());
		Assert.assertEquals(1, map.get('b').intValue());
		Assert.assertEquals(1, map.get('s').intValue());
		Assert.assertEquals(1, map.get('t').intValue());
		Assert.assertEquals(2, map.get('v').intValue());
		Assert.assertEquals(2, map.get('h').intValue());
		Assert.assertEquals(4, map.get('i').intValue());
		Assert.assertEquals(2, map.get('y').intValue());
		Assert.assertEquals(2, map.get('n').intValue());

	}
}
