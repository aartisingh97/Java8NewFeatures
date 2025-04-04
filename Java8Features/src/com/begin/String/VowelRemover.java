package com.begin.String;

import java.util.Scanner;

public class VowelRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = scanner.nextLine();

		StringBuffer output = new StringBuffer();

		// Another way
		System.out.println(input.replaceAll("[aeiou]", ""));

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				continue;
			} else {
				output.append(input.charAt(i));
			}
		}
		System.out.println(output);
		scanner.close();

	}

}
