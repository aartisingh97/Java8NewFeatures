package com.begin.String;

import java.util.Scanner;

public class CountWordsInSen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();// nextLine for sentence
		System.out.println("using inbiuilt function:: " + input.split(" ").length);
		int count = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			if (Character.isWhitespace(input.charAt(i))) {
				count++;
			}
		}

		System.out.println(count + 1);
		scanner.close();
	}

}
