package com.leetcode.practice;

public class SubArrayWithOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArrayCount subArrayCount = new SubArrayCount();
		int[] arr = { 1, 3, 5 };
		System.out.println(subArrayCount.numOfSubarrays(arr));
	}

}

class SubArrayCount {
	public int numOfSubarrays(int[] arr) {
		final int mod = 1000000007;
		int[] cnt = { 1, 0 };
		int ans = 0, s = 0;
		for (int x : arr) {
			s += x;
			ans = (ans + cnt[s % 2 == 0 ? 1 : 0]) % mod;
			++cnt[s & 1];
		}
		return ans;
	}
}
