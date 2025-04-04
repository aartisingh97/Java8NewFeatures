package com.begin.numbers;

import java.util.Scanner;

public class FibonacciUsingRecursion {

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number::");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print(" " + fibonacci(i));
		}
		scanner.close();

	}

}
