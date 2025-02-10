package com.leetcode.practice;

public class ClearDigit3174 {

	public static void main(String[] args) {
		String inputString = "cb3";
		System.out.println("clearDigits::::::" + clearDigits(inputString));

	}

	public static String clearDigits(String inputString) {
		StringBuilder resultString = new StringBuilder();
		for (char character : inputString.toCharArray()) {
			if (Character.isDigit(character)) {
				resultString.deleteCharAt(resultString.length() - 1);
			} else {
				resultString.append(character);
			}
		}
		return resultString.toString();
	}
}
