package com.begin.ArrayAndMatrics;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");

		int m = scanner.nextInt();

		System.out.println("Enter the number of column");

		int n = scanner.nextInt();

		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int sum[][] = new int[m][n];

		System.out.println("Enter Matrix1 ");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter Matrix2 ");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("Matrix is ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(a[i][j] + " ");
			}
		}

		scanner.close();
	}
}
