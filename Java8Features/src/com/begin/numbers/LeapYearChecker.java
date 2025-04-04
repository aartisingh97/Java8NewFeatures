package com.begin.numbers;

import java.util.Scanner;
//1964, 1968 ,1972, 1976, 1980, 1984, 1988, 1992, 1996,
//2000, 2004, 2008, 2012, 2016, 2020, 2024

public class LeapYearChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year::");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a leap year");
		}
		scanner.close();
	}

}
