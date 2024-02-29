package com.daily.practice.feb21.string.programs;

public class ReplaceTheSpacesOfAStringWithSpecificCharacter {

	public String replace1(String sentence) {
		for (int i = 0; i < sentence.length(); i++) {
			char ch = '-';
			if (sentence.charAt(i) == ' ') {
				sentence = sentence.replace(' ', ch);
				// System.out.println(sentence);
			}
		}
		return sentence;
	}

	public String replace2(String sentence2,char ch2) {
		
		sentence2 = sentence2.replace(' ', ch2);
		//System.out.println(sentence2);
		return sentence2;
	}
}
