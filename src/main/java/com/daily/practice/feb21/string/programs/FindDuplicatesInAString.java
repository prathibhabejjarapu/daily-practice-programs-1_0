package com.daily.practice.feb21.string.programs;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInAString {

	public Map<Character, Integer> findDuplicateCharsInAString(String input) {
		Map<Character, Integer> dupCharMap = new HashMap<>();
		char[] ch = input.toCharArray();
		for (Character key : ch) {
			if (key != ' ') {
				if (dupCharMap.containsKey(key)) {
					dupCharMap.put(key, dupCharMap.get(key) + 1);
				} else {
					dupCharMap.put(key, 1);
				}
			}
		}
		System.out.println(dupCharMap);
		return dupCharMap;
	}

}
