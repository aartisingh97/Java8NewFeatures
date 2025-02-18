package com.leetcode.practice;

public class SmallestNumFromDI {
	private boolean[] visited = new boolean[10];
	private StringBuilder currentSequence = new StringBuilder();
	private String pattern;
	private String result;

	public String smallestNumber(String pattern) {
		this.pattern = pattern;
		findSmallestNumber(0);
		return result;
	}

	private void findSmallestNumber(int currentIndex) {
		if (result != null) {
			return;
		}
		if (currentIndex == pattern.length() + 1) {
			result = currentSequence.toString();
			return;
		}
		for (int digit = 1; digit < 10; ++digit) {
			if (!visited[digit]) {
				if (currentIndex > 0 && pattern.charAt(currentIndex - 1) == 'I'
						&& currentSequence.charAt(currentIndex - 1) - '0' >= digit) {
					continue;
				}
				if (currentIndex > 0 && pattern.charAt(currentIndex - 1) == 'D'
						&& currentSequence.charAt(currentIndex - 1) - '0' <= digit) {
					continue;
				}
				visited[digit] = true;
				currentSequence.append(digit);
				findSmallestNumber(currentIndex + 1);
				currentSequence.deleteCharAt(currentSequence.length() - 1);
				visited[digit] = false;
			}
		}
	}

	public static void main(String[] args) {
		SmallestNumFromDI smallestNumFromDI = new SmallestNumFromDI();
		String pattern = "IIIDIDDD"; // Example pattern
		String result = smallestNumFromDI.smallestNumber(pattern);
		System.out.println(result); // Prints the smallest number satisfying the pattern
	}

}
