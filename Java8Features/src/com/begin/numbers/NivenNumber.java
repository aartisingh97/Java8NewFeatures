package com.begin.numbers;
//num=12 niven =12%1+2==0

import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number::");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num % sum(num) == 0 ? "Niven Number" : "Not a Niven Number");
		scanner.close();
	}

	public static int sum(int num) {
		int digit, sum = 0;
		while (num != 0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return sum;
	}
}
