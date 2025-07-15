package com.leetcode.practice;

public class MaxSubArray {
	public static int maxSubArray(int[] nums) {

		int maxAsOfNow = nums[0];
		int currentSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (currentSum < 0) {
				currentSum = 0;
			}
			currentSum = currentSum + nums[i];

			if (currentSum > maxAsOfNow) {
				maxAsOfNow = currentSum;
			}

		}
		return maxAsOfNow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));

	}

}
