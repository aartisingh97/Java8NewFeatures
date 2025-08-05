package com.leetcode.practice;

public class FindMaxConsecutiveOnes {
	public static int findmaxConseOnes(int[] arr) {
		int count = 0;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count = 0;
			} else {
				count++;
			}
			if (count > ans) {
				ans = count;
			}

		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		System.out.println("Max consecutive 1's in array:: " + findmaxConseOnes(nums));

	}

}
