package com.begin.String;

import java.util.Scanner;

public class StringEndsWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();// nextLine for sentence
		System.out.println("Enter a String which want to serach:");
		String targetString = scanner.nextLine();// nextLine for sentence
		int count = 0;
		for (int i = input.length() - 1, j = targetString.length() - 1; j >= 0; i--, j--) {
			if (input.charAt(i) == targetString.charAt(j)) {
				count++;
			}
		}
		if (count == targetString.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();

	}

}
