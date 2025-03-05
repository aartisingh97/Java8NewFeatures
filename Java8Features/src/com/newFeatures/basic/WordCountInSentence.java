package com.newFeatures.basic;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java is fun and java is powerful";
		Map<String, Long> wordcount = Arrays.stream(sentence.split(" ")).map(s -> s.toLowerCase())
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println(wordcount);
	}

}
