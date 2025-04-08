package com.begin.ArrayAndMatrics;

import java.util.Scanner;

public class MatrixDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");

		int m = scanner.nextInt();

		System.out.println("Enter the number of column: ");

		int n = scanner.nextInt();

		int a[][] = new int[m][n];

		System.out.println("Enter the matrix");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(a[i][j] + " ");
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.println(a[i][j] + " ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
