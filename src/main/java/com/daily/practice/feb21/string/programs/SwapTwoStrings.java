package com.daily.practice.feb21.string.programs;

public class SwapTwoStrings {
	public String swap(String s1, String s2) {

		System.out.println("Before swap the strings " + s1 + " and " + s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swap the strings " + s1 + " and " + s2);
		return s2;

	}

	public String swap2(String s3, String s4) {
		System.out.println("Before swap the strings " + s3 + " and " + s4);
		String temp = "";
		temp = s3;
		s3 = s4;
		s4 = temp;
		System.out.println("After swap the strings " + s3 + " and " + s4);
		return s3;
	}
}
