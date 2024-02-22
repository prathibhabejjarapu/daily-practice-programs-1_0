package com.daily.practice.feb21.string.programs;

public class RemoveWhiteSpacesInString {
	public String removingSpacesInString(String sentence) {
		String withoutSpaces = "";

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != ' ') {

				withoutSpaces = withoutSpaces + sentence.charAt(i);
			}
		}
		return withoutSpaces;

	}
}
