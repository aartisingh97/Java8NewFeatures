package com.begin.Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println(factorial(num));
	}

	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			return num;
		} else
			return num * factorial(num - 1);

	}

}
