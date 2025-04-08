package com.begin.ArrayAndMatrics;

import java.util.Scanner;

public class SumOfPosAndNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elments");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		int nSum = 0, pSum = 0;
		System.out.println("Enter the elements for array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 && arr[i] != 0) {
				nSum += arr[i];
			} else if (arr[i] > 0 && arr[i] != 0) {
				pSum += arr[i];
			}
		}

		System.out.println("Sum of Negative::" + nSum);
		System.out.println("Sum of Positive::" + pSum);

		scanner.close();
	}

}
