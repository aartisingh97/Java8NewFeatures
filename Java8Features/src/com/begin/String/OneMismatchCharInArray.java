package com.begin.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OneMismatchCharInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("bana", "apple", "banaba", "bananzo", "banamf"));
		if (has_one_mismatch(str, arr))
			System.out.println("True");
		else
			System.out.println("False");
	}

	private static boolean has_one_mismatch(String str, ArrayList<String> arr) {
		// TODO Auto-generated method stub
		Collections.sort(arr);// apple, bana, banaba, banamf, bananzo
		for (String words : arr) {
			int count = 0;
			int i = 0;
			while (i < words.length() && count <= 1) {
				if (str.charAt(i) != words.charAt(i)) {
					count += 1;
				}
				i += 1;
			}
			if (count > 1 || words.length() < str.length() - 1) {
				continue;
			}
			if (words.length() > str.length() + 1) {
				break;
			}
			if (count == 1 && (words.length() == str.length() || words.length() == str.length() - 1)) {
				return true;
			}
		}
		return false;
	}

}
