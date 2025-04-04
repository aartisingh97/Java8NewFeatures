package com.begin.numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:;");
		Scanner scanner = new Scanner(System.in);
		int result = 0, digit, num = scanner.nextInt();
		while (num != 0) {
			digit = num % 10;
			result = result * 10 + digit;
			num = num / 10;
		}
		System.out.println("result::" + result);
		scanner.close();

	}

}
