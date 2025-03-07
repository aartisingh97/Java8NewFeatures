package com.sort.array;

public class EqualSuceedingElement {

	public static void findIndexes(int[] arr) {
		int total = 0;

		// calculating total of array
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		int sum = 0;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == total - sum - arr[i]) {
				System.out.println(i + " ");
				found = true;
			}
			sum += arr[i];
		}
		if (!found) {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 36, 2, 17, 6, 6, 5 };

		findIndexes(arr);
	}

}
