package com.begin.numbers;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number::");
		Scanner scanner = new Scanner(System.in);
		int digit, sum = 0, num = scanner.nextInt();
		while (num != 0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println("sum" + sum);
		scanner.close();
	}

}
