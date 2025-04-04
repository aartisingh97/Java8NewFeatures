package com.begin.Recursion;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number till want to sum");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		System.out.println(sum(num));
		scanner.close();

	}

	public static int sum(int num) {
		if (num <= 1) {
			return num;
		} else {
			return num + sum(num - 1);
		}
	}

}
