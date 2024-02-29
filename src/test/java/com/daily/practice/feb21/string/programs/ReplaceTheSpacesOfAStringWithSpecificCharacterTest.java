package com.daily.practice.feb21.string.programs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReplaceTheSpacesOfAStringWithSpecificCharacterTest {
	private ReplaceTheSpacesOfAStringWithSpecificCharacter re;

	@Before
	public void setUp() {
		re = new ReplaceTheSpacesOfAStringWithSpecificCharacter();
	}

	@Test
	public void testCaseForReplace1() {
		String sentence = "Hi i am prathibha and i am learning java";
		String result = re.replace1(sentence);
		Assert.assertEquals("Hi-i-am-prathibha-and-i-am-learning-java", result);
	}

	@Test
	public void testCaseForReplace2() {
		String sentence2 = "Hello java";
		String result2 = re.replace2(sentence2, '*');
		Assert.assertEquals("Hello*java", result2);
	}
}
