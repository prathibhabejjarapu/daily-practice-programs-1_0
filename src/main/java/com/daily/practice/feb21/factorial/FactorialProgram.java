package com.daily.practice.feb21.factorial;

public class FactorialProgram {
	int  result = 1;

	public long fact(int number) {
		for (int i = number; i >= 2; i--) {
			result = result * i;
		}
		return result;
	}
}
