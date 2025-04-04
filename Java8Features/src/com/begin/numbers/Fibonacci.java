package com.begin.numbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.println(n1 + " " + n2);
		for (int i = 2; i < num; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		scanner.close();

	}

}
