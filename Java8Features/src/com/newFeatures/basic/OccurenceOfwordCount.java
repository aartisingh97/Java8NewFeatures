package com.newFeatures.basic;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfwordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Java is fun and Java is powerful";

		Map<String, Long> wordCount = Arrays.stream(sentence.split(" "))
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));

		System.out.println(wordCount);

	}

}
