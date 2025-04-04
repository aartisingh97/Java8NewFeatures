package com.begin.String;

import java.util.Scanner;

public class MAxOccuredCharFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println("Enter a String");

		int arr[] = new int[256];
		for (int i = 0; i < s.length(); i++) {

			arr[(int) s.charAt(i)]++;
		}

		int m = 0;

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] > arr[m]) {
				m = j;
			}
		}

		System.out.println("MAx occuring character is: " + (char) m);

		scanner.close();

	}

}
