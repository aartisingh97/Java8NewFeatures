package com.newFeatures.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetIgnoreFirst5Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(0, 3, 10, 20, 30, 15, 15, 1, 13, 2, 2, 10, 40, 19, 3, 40);
		List<Integer> first5Elements = list.stream().limit(5).collect(Collectors.toList());
		// Will print first 5 numbers
		System.out.println("First 5 numbers in list is: " + first5Elements);
		int sumOf5Numbers = list.stream().limit(5).reduce((a, b) -> a + b).get();
		System.out.println("Addition of first 5 numbers in list is: " + sumOf5Numbers);

		List<Integer> first5SkippedElements = list.stream().skip(5).collect(Collectors.toList());
		System.out.println("After skipping first 5 numbers final list is: " + first5SkippedElements);
		int sumOfRest5Numbers = list.stream().skip(5).reduce((a, b) -> a + b).get();
		System.out.println("Addition of list after skipping 5 numbers in list is: " + sumOfRest5Numbers);
	}

}
