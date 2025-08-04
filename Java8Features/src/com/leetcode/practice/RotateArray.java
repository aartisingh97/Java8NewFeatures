package com.leetcode.practice;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 2, 4, 5, 6, 7, 8, 9, 3 };
		int k = 3;
		int[] result = rotate(num, k);
		System.out.println(Arrays.toString(result));

	}

	public static int[] rotate(int[] arr, int k) {
		int n = arr.length;
		k %= n;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
		return arr;

	}

	static void reverse(int[] nums, int start, int end) {
		int i = start, j = end;
		while (i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;

		}

	}

}
