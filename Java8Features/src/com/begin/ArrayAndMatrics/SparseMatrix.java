package com.begin.ArrayAndMatrics;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of rows ");
		int m = scanner.nextInt();

		System.out.println("Enter the number of columns ");
		int n = scanner.nextInt();

		int a[][] = new int[m][n];

		System.out.println("Enter the matrix ");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Matrix is ");
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 0) {
					count++;
				}
			}

			if (count > m * n / 2) {
				System.out.println("Sparse Matrix");
			} else {
				System.out.println("Not a sparse Matrix");
			}
		}
	}

}
