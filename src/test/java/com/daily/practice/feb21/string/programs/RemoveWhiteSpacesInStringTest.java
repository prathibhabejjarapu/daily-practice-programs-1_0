package com.daily.practice.feb21.string.programs;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
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
		String sentence = "Hi iam prathibha how are you";
		String result = str.removingSpacesInString(sentence);
		Assert.assertEquals("Hiiamprathibhahowareyou", result);
	}
}
