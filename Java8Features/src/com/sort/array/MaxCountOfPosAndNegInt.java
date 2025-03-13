package com.sort.array;

public class MaxCountOfPosAndNegInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { -2, -1, -1, 1, 2, 3 };

		System.out.println("The maximum count among positive and negative numbers is::: " + maximumCount(nums));
	}

	static int maximumCount(int[] nums) {
		int positive = 0, negative = 0;
		for (int num : nums) {
			if (num > 0) {
				++positive;
			} else if (num < 0) {
				++negative;
			}
		}
		return Math.max(positive, negative);
	}

}
