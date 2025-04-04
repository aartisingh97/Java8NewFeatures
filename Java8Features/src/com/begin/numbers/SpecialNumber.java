package com.begin.numbers;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number::");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int digit1 = num % 10, digit2 = num / 10, result;

		result = (digit1 + digit2) + (digit1 * digit2);
		scanner.close();

		System.out.println(result == num ? "It is a special number" : "Not a special Number");
	}

}
