package com.leetcode.practice;

public class RemoveSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "daabcbaabcbc", part = "abc";
		String outputString = removeOccurrences(s, part);
		System.out.println("outputString::::::" + outputString);
	}

	public static String removeOccurrences(String s, String part) {
		while (s.contains(part)) {
			s = s.replaceFirst(part, "");
		}
		return s;
	}
}
