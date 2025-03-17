package com.sort.array;

public class ListOfMissingNumber {

	// Function to find the missing elements
	static void printMissingElements(int arr[], int N) {

		// Initialize diff
		int diff = arr[0] - 0;
		for (int i = 0; i < N; i++) {

			if (arr[i] - i != diff) {

				while (diff < arr[i] - i) {
					System.out.print((diff + i) + " ");
					diff++;
				}

			}
		}

	}

	// Driver Code
	public static void main(String[] args) {

		// Given array arr[]
		int arr[] = { 6, 7, 10, 11, 13 };

		int N = arr.length;

		// Function call
		printMissingElements(arr, N);
	}

}
