package com.sort.array;

import java.util.HashMap;
import java.util.Map;

public class CountSubStrConEveryVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountSubStr countSubStr = new CountSubStr();
		System.out.println(countSubStr.countOfSubstrings("ieaouqqieaouqq", 1));
	}

}

class CountSubStr {
	public long countOfSubstrings(String word, int k) {
		return countSubstringsWithVowels(word, k) - countSubstringsWithVowels(word, k + 1);
	}

	private long countSubstringsWithVowels(String word, int k) {
		long totalSubstrings = 0;
		int leftPointer = 0, nonVowelCount = 0;
		Map<Character, Integer> vowelFrequency = new HashMap<>(5);

		for (char currentChar : word.toCharArray()) {
			if (isVowel(currentChar)) {
				vowelFrequency.merge(currentChar, 1, Integer::sum);
			} else {
				++nonVowelCount;
			}

			while (nonVowelCount >= k && vowelFrequency.size() == 5) {
				char leftChar = word.charAt(leftPointer++);
				if (isVowel(leftChar)) {
					if (vowelFrequency.merge(leftChar, -1, Integer::sum) == 0) {
						vowelFrequency.remove(leftChar);
					}
				} else {
					--nonVowelCount;
				}
			}
			totalSubstrings += leftPointer;
		}
		return totalSubstrings;
	}

	private boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}