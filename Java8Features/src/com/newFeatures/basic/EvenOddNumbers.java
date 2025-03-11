package com.newFeatures.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 2, 3, 45, 67, 9, 90, 87, 8, 2);
		List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(
				"List of even numbers: " + Arrays.toString(evenList.toArray()).replace("[", "").replace("]", ""));

		List<Integer> oddList = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(
				"List of odd numbers: " + Arrays.toString(oddList.toArray()).replace("[", "").replace("]", ""));

		String num = "12345678";
		List<Integer> evenListFromString = num.chars().map(Character::getNumericValue).filter(n -> n % 2 == 0).boxed()
				.collect(Collectors.toList());
		System.out.println("evenListFromString:::" + evenListFromString);

	}

}
