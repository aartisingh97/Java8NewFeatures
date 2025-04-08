package com.begin.ArrayAndMatrics;

import java.util.Scanner;

public class LastMElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of Elements: ");

		int n = scanner.nextInt();

		int a[] = new int[n];

		System.out.println("Enter the Elements of the array");

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.println("Enter the number of last elements of the displaying: ");

		int m = scanner.nextInt();

		for (int i = n - m; i < n; i++) {
			System.out.println(a[i]);
		}

		scanner.close();

	}

}
