package com.begin.String;

import java.util.Scanner;

public class EvenWordPrinterAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a String");

		String input = scanner.nextLine();

		String str[] = input.split(" ");

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() % 2 == 0) {
				System.out.println(str[i]);
			}
		}
		scanner.close();
	}

}
