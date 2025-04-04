package com.begin.numbers;

import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number::");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Not a even number");
			}
		} else {
			System.out.println("Not a valid number");
		}
		scanner.close();

	}

}
