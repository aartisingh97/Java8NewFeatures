package com.leetcode.practice;

public class MaxSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 18, 43, 36, 13, 7 };
		int maxSum = maximumSum(nums);
		System.out.printf("maxSum::::" + maxSum);

	}

	public static int maximumSum(int[] nums) {
		int[] sumOfDigits = new int[100]; // Array to store maximum number for each sum of digits
		int maxSum = -1; // Variable to store the maximum sum found
		for (int number : nums) {
			int digitSum = 0; // Variable to store the sum of digits of the current number
			for (int temp = number; temp > 0; temp /= 10) {
				digitSum += temp % 10; // Adding the last digit of the number to digitSum
			}
			if (sumOfDigits[digitSum] > 0) {
				maxSum = Math.max(maxSum, sumOfDigits[digitSum] + number); // Update maxSum if a valid pair is found
			}
			sumOfDigits[digitSum] = Math.max(sumOfDigits[digitSum], number); // Store the largest number for this digit
																				// sum
		}
		return maxSum; // Return the result
	}
}
