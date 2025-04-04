package com.begin.numbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int digit, result = 0, num = scanner.nextInt();
		int temp = num;
		while (num != 0) {
			digit = num % 10;
			result = result * 10 + digit;
			num = num / 10;

		}
		if (result == temp) {
			System.out.println("Ït is a Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number::");
		}
		scanner.close();

	}

}
