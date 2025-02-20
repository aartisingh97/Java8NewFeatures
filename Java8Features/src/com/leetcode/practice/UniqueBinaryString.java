package com.leetcode.practice;

public class UniqueBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		String[] nums = { "01", "10" };
		System.out.println("a binary string of length n that does not appear in nums:  "
				+ solution.findDifferentBinaryString(nums));
	}

}

class Solution {
	public String findDifferentBinaryString(String[] nums) {
		int mask = 0;
		for (var x : nums) {
			int cnt = 0;
			for (int i = 0; i < x.length(); ++i) {
				if (x.charAt(i) == '1') {
					++cnt;
				}
			}
			mask |= 1 << cnt;
		}
		for (int i = 0;; ++i) {
			if ((mask >> i & 1) == 0) {
				return "1".repeat(i) + "0".repeat(nums.length - i);
			}
		}
	}
}