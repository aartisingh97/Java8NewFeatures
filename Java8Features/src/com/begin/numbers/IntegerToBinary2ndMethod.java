package com.begin.numbers;

import java.util.Scanner;

public class IntegerToBinary2ndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a NUmber::");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(Integer.toBinaryString(num));
		scanner.close();
	}

}
