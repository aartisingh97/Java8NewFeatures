package com.begin.numbers;

import java.util.Scanner;

public class PalindromeCheckerAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number::");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		StringBuilder sb = new StringBuilder(num);
		if (num.equals(sb.reverse().toString())) {
			System.out.println("It is a Palindrome::");
		} else {
			System.out.println("It is not a Palindrome::");
		}
		scanner.close();
	}

}
