package com.begin.String;

import java.util.Scanner;

public class WordFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a String");

		String s1 = scanner.nextLine();

		String s2 = "gold";

		boolean found = false;

		s1 = s1.toLowerCase();

		for (int i = 0; i < s1.length(); i++) {
			int k = i, j = 0;
			for (j = 0; j < s2.length(); j++) {
				if (s1.charAt(k) != s2.charAt(j)) {
					break;
				}
				k++;
			}
			if (j == s2.length()) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Gold found");
		} else {
			System.out.println("not found");
		}
	}

}
