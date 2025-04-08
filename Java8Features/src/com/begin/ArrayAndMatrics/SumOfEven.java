package com.begin.ArrayAndMatrics;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements");

		int n = scanner.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the elements for array  ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {

				sum = sum + arr[i];
			}
		}

		System.out.println("Sum::" + sum);

		scanner.close();
	}

}
