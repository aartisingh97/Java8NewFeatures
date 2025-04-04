package com.begin.numbers;

import java.util.Scanner;

//if in mid 0 is available then it is known as duck number
//1809072---Duck Number
//1080--Duck Number
//0012364--not a duck number
public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number:::");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt();
		boolean isDuckNumber = false;
		while (num != 0) {
			digit = num % 10;
			if (digit == 0) {
				isDuckNumber = true;
				break;
			}
			num = num / 10;
		}
		if (isDuckNumber) {
			System.out.println("It is a Duck Number::");
		} else {
			System.out.println("It is not a Duck Number::");
		}
		scanner.close();

	}

}
