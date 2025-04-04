package com.begin.numbers;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a start::");
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		System.out.println("Enter end::");
		int end = scanner.nextInt();
		for (int i = start; i < end; i++) {
			int count = 0;
			if (i > 1) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.print(" " + i);
				}
			}

		}
		scanner.close();
	}

}
