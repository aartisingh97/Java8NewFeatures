package com.newFeatures.basic;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listStrings = List.of("Atisha", "Sujata", "Kadambari", "Pritusha", "Deepanjali");
		String longestString = findLongestString(listStrings);
		System.out.println("Longest String from lis using lengtht::: " + longestString);

		System.out
				.println("Longest String from list using Comparator::: " + findLongestStringByComparator(listStrings));

	}

	private static String findLongestString(List<String> listStrings) {
		// TODO Auto-generated method stub
		Optional<String> longest = listStrings.stream().max((a, b) -> a.length() - b.length());
		return longest.orElse(null);
	}

	private static String findLongestStringByComparator(List<String> listStrings) {
		// TODO Auto-generated method stub
		Optional<String> longest = listStrings.stream().max(Comparator.comparingInt(String::length));
		return longest.orElse(null);
	}

}
