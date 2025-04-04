package com.begin.String;

import java.util.Scanner;

public class MiddleCharFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");

		String input = scanner.nextLine();

		if (input.length() % 2 == 0) {
			System.out.println(input.substring(input.length() / 2 - 1, input.length() / 2 + 1));
		} else {
			System.out.println(input.substring(input.length() / 2, input.length() / 2 + 1));
		}

	}

}
