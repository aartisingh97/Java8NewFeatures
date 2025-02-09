package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class BadPairs2364 {
	public static void main(String[] args) {
		int[] nums = { 4, 1, 3, 3 };
		long count = countBadPairs(nums);

		System.out.println("countBadPairs::::::" + count);
	}

	public static long countBadPairs(int[] nums) {
		Map<Integer, Integer> differenceCount = new HashMap<>(); // Changed 'cnt' to 'differenceCount'
		long badPairsCount = 0; // Changed 'ans' to 'badPairsCount'

		for (int index = 0; index < nums.length; ++index) { // Changed 'i' to 'index'
			int difference = index - nums[index]; // Changed 'x' to 'difference'
			badPairsCount += index - differenceCount.getOrDefault(difference, 0); // Renamed variables in this line
			differenceCount.merge(difference, 1, Integer::sum); // Renamed variables in this line
		}

		return badPairsCount;
	}

}
