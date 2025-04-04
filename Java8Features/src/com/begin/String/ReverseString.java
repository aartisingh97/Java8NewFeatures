package com.begin.String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String result = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			result += input.charAt(i);
		}

		System.out.println(result);
		// "or"

		System.out.println("Using reverse in build funtion: " + new StringBuffer(input).reverse());
		scanner.close();
	}

}
