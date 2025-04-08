package com.begin.Recursion;

public class Power {

	public static int power(int base, int exponent) {
		if (exponent == 1) {
			return base;
		} else {
			return base * power(base, exponent - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 3));
	}

}
