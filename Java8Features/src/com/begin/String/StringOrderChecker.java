package com.begin.String;

import java.util.Arrays;
import java.util.Scanner;

public class StringOrderChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");

		String input = scanner.nextLine();
		char[] charArray = input.toCharArray();

		Arrays.sort(charArray);

		System.out.println(new String(charArray).equals(input));
	}

}
