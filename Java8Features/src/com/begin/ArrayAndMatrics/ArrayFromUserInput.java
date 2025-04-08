package com.begin.ArrayAndMatrics;

import java.util.Scanner;

public class ArrayFromUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");

		int n = scanner.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the element for array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		scanner.close();
	}

}
