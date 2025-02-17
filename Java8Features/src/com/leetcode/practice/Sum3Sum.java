package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an integer array nums, return all the triplets
 *  [nums[i], nums[j], nums[k]] such that i != j, i != k, 
 *  and j != k, and nums[i] + nums[j] + nums[k] == 0.
 */
public class Sum3Sum {
	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> output = threeSum(nums);
		System.out.printf("Possible Array::::::" + output);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> triplets = new ArrayList<>();
		int length = nums.length;
		for (int first = 0; first < length - 2 && nums[first] <= 0; ++first) {
			if (first > 0 && nums[first] == nums[first - 1]) {
				continue;
			}
			int second = first + 1, third = length - 1;
			while (second < third) {
				int sum = nums[first] + nums[second] + nums[third];
				if (sum < 0) {
					++second;
				} else if (sum > 0) {
					--third;
				} else {
					triplets.add(List.of(nums[first], nums[second++], nums[third--]));
					while (second < third && nums[second] == nums[second - 1]) {
						++second;
					}
					while (second < third && nums[third] == nums[third + 1]) {
						--third;
					}
				}
			}
		}
		return triplets;
	}
}
