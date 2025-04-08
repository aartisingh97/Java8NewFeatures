package com.begin.ArrayAndMatrics;

import java.util.Scanner;

public class MiniPeaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements");

		int n = scanner.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the Elements for the array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}

		scanner.close();
	}

}
