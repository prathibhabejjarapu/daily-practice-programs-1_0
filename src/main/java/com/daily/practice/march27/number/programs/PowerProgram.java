package com.daily.practice.march27.number.programs;

public class PowerProgram {

	int square = 1;

	public int power(int number, int power1) {
		for (int b = power1; b > 0; b--) {
			square = square * number;
		}
		return square;
	}
}
