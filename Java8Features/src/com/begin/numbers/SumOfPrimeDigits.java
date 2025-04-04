package com.begin.numbers;

import java.util.Scanner;

public class SumOfPrimeDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Enter a Number::");
		Scanner scanner = new Scanner(System.in);
		int digit, sum = 0, num = scanner.nextInt();
		while (num != 0) {
			digit = num % 10;
			if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
				sum = sum + digit;
			}
			num = num / 10;
		}
		System.out.println("sum of prime digits" + sum);
		scanner.close();

	}

}
