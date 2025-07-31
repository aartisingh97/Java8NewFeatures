package com.leetcode.practice;

public class ProductOfArrElementExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 3, 5, 6, 2 };
		int[] res = productExceptSelf(arr);
		for (int val : res) {
			System.out.print(val + " ");
		}

	}

	public static int[] productExceptSelf(int[] nums) {

		int[] ans = new int[nums.length];
		int[] leftArray = new int[nums.length];
		int[] rightArray = new int[nums.length];
		leftArray[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			leftArray[i] = leftArray[i - 1] * nums[i - 1];

		}

		rightArray[nums.length - 1] = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			rightArray[i] = rightArray[i + 1] * nums[i + 1];
		}

		for (int i = 0; i < nums.length; i++)
			ans[i] = leftArray[i] * rightArray[i];
		return ans;
	}
}
