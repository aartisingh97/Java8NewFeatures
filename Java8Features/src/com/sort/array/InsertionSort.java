package com.sort.array;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 7, 4, 6, 4, 9 };
		int insertKey = 0;
		for (int i = 1; i < arr.length; i++) {
			insertKey = arr[i];
			int j = i - 1;
			while (arr[j] > insertKey && j >= 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = insertKey;
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
