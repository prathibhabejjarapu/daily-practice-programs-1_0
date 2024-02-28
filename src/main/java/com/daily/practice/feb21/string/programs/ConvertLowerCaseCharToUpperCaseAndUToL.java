package com.daily.practice.feb21.string.programs;

public class ConvertLowerCaseCharToUpperCaseAndUToL {
	
		String result = "";

	public String convertOpposite(String name) {
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (Character.isUpperCase(c)) {
				result = result + Character.toLowerCase(c);

			} else if (Character.isLowerCase(c)) {
				result = result + Character.toUpperCase(c);
			}
		}
		return result;
	}
}
