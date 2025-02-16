package com.leetcode.practice;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dfa12321afd";
		System.out.printf("constructDistancedSequence:::" + secondHighest(s));
	}

	public static int secondHighest(String s) {
		int a = -1, b = -1;
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				int v = c - '0';
				if (v > a) {
					b = a;
					a = v;
				} else if (v > b && v < a) {
					b = v;
				}
			}
		}
		return b;
	}

}
