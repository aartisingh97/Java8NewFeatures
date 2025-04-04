package com.begin.numbers;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number::");
		Scanner scanner = new Scanner(System.in);
		int count = 0, num = scanner.nextInt();
		while (num != 0) {
			count++;
			num = num / 10;
		}

		System.out.println("Count of digits" + count);
		scanner.close();

	}

}
