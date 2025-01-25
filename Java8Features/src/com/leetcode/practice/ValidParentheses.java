package com.leetcode.practice;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		String s = "{()}";
		if (isValid(s)) {
			System.out.println("Valid Parentheses");
		} else {
			System.out.println("Not a valid Parentheses");
		}
	}

	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else {
				if (!st.empty() && ((st.peek() == '(' && s.charAt(i) == ')') || (st.peek() == '{' && s.charAt(i) == '}')
						|| (st.peek() == '[' && s.charAt(i) == ']'))) {
					st.pop();
				} else {
					return false;
				}
			}

		}
		return st.empty();

	}

}
