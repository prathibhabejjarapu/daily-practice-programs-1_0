package com.daily.practice.feb21.string.programs;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RemoveWhiteSpacesInStringTest {

	private RemoveWhiteSpacesInString str;

	@Before
	public void setUp() {
		str = new RemoveWhiteSpacesInString();
	}

	@Test
	public void testCaseForremovingSpacesInString() {
		String sentence = "Hi iam  prat_hibha how are you";
		String result = str.removeSpacesInString(sentence);
		assertEquals("Hiiamprat_hibhahowareyou", result);
	}
}
