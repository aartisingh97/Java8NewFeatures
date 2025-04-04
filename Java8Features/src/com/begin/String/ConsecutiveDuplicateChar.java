package com.begin.String;

import java.util.Scanner;

public class ConsecutiveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");

		String input = scanner.nextLine();

		boolean found = false;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				found = true;
				break;
			}
		}

		System.out.println(found);
		scanner.close();

	}

}
