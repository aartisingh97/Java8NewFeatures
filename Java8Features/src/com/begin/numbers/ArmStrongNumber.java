package com.begin.numbers;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number::");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = num;
		int rem, sum = 0;
		while (num != 0) {
			rem = num % 10;
			sum += rem * rem * rem;
			num = num / 10;

		}
		scanner.close();
		System.out.println(temp == sum ? "Arm Strong Number" : "Not  a ArmStrong Number");
	}

}
