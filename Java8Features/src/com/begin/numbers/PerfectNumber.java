package com.begin.numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub`
		System.out.println("Enter a number::");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (isPerfect(num)) {
			System.out.println("It is Perfect number");
		} else {
			System.out.println("Not a Perfect number");
		}
		scanner.close();

	}

	public static boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return num == sum;
	}

}
