package com.daily.practice.feb21;

public class EqualityOfArrays {

	/*
	 * public static void main(String[] args) { int arrayOne[] = { 2, 5, 7, 9, 10 };
	 * int arrayTwo[] = { 2, 5, 7 }; boolean value = true;
	 * 
	 * // TODO : Execute from test case. if (arrayOne.length != arrayTwo.length) {
	 * value = false; } else { for (int i = 0; i < arrayOne.length; i++) {
	 * System.out.println("In side for loop"); if (arrayOne[i] != arrayTwo[i]) {
	 * value = false; break; } } }
	 * 
	 * if (value) { System.out.println("They are equal"); } else {
	 * System.out.println("They are NOT equal"); }
	 * 
	 * }
	 */
	
	
	public boolean areTheseTwoArraysSame(int[] arrayOne, int[] arrayTwo) {
		boolean returnValue = true;
		if (arrayOne.length != arrayTwo.length) {
			returnValue = false;
		} else {
			for (int i = 0; i < arrayOne.length; i++) {
				//System.out.println("In side for loop");
				if (arrayOne[i] != arrayTwo[i]) {
					returnValue = false;
					break;
				}
			}
		}
		return returnValue;
	}

}
