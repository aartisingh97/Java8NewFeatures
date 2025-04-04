package com.begin.numbers;

import java.util.Scanner;

public class DigitExtracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number::");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt();
		while (num != 0) {
			digit = num % 10;
			System.out.print(digit + " ");
			num = num / 10;

		}
		scanner.close();

	}

}
