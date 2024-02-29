package com.daily.practice.feb21.string.programs;

public class ConvertLowerCaseCharToUpperCaseAndUToL {

	public String convertOpposite(String name) {
		String result = "";
		char ch = '*';
		for (int i = name.length() - 1; i >= 0; i--) {
			char c = name.charAt(i);
			if (Character.isUpperCase(c)) {
				result = result + Character.toLowerCase(c);

			} else if (Character.isLowerCase(c)) {
				result = result + Character.toUpperCase(c);
			} else if (c == ch) {
				result = result + c;
			}
		}
		//System.out.println(result);
		return result;
	}

}
