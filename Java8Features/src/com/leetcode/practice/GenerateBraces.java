package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateBraces {
	public static void main(String[] args) {
		System.out.printf("generateParenthesis" + generateParenthesis(3));

	}

	private static List<String> result = new ArrayList<>(); // Changed 'ans' to 'result'
	private static int pairCount = 3;

	// Changed 'n' to 'pairCount'

	public static List<String> generateParenthesis(int pairCount) {
		pairCount = pairCount;
		generateCombinations(0, 0, "");
		return result;
	}

	private static void generateCombinations(int leftCount, int rightCount, String currentString) {
		if (leftCount > pairCount || rightCount > pairCount || leftCount < rightCount) {
			return;
		}
		if (leftCount == pairCount && rightCount == pairCount) {
			result.add(currentString);
			return;
		}
		generateCombinations(leftCount + 1, rightCount, currentString + "(");
		generateCombinations(leftCount, rightCount + 1, currentString + ")");
	}

}
