package com.leetcode.practice;

public class AbsoluteSumOfAnySubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsoluteSum absoluteSum = new AbsoluteSum();
		int[] nums = { 1, -3, 2, 3, -4 };
		System.out.println("Absolute Sum of Any subarray:::" + absoluteSum.maxAbsoluteSum(nums));
	}

}

class AbsoluteSum {
	public int maxAbsoluteSum(int[] nums) {
		int f = 0, g = 0;
		int ans = 0;
		for (int x : nums) {
			f = Math.max(f, 0) + x;
			g = Math.min(g, 0) + x;
			ans = Math.max(ans, Math.max(f, Math.abs(g)));
		}
		return ans;
	}
}
