package com.leetcode.practice;

public class LongestCmmonPrefix14 {

	public static void main(String[] args) {

		String[] words = { "flower", "flow", "flight", "flame", "flask", "flour" };
		String longestPrefix;
		try {
			longestPrefix = longestCommonPrefix(words);

			System.out.printf("Longest Prefix:::" + longestPrefix);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String longestCommonPrefix(String[] words) {
		int numWords = words.length;
		for (int index = 0; index < words[0].length(); ++index) {
			for (int i = 1; i < numWords; ++i) {
				if (words[i].length() <= index || words[i].charAt(index) != words[0].charAt(index)) {
					return words[0].substring(0, index);
				}
			}
		}
		return words[0];
	}

}
