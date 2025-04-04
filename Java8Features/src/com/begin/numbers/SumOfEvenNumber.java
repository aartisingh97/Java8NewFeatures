package com.begin.numbers;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the start::");
		Scanner scanner = new Scanner(System.in);
		int evensum = 0, oddsum = 0, start = scanner.nextInt();
		System.out.println("Enter the end::");
		int end = scanner.nextInt();
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				evensum = evensum + i;
			} else {
				oddsum = oddsum + i;
			}
		}

		System.out.println("Even Numbers sum" + evensum);
		System.out.println("Odd Numbers sum" + oddsum);
		scanner.close();

	}

}
