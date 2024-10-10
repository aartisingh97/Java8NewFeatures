package com.newFeatures.basic;

import java.util.Arrays;
import java.util.List;

public class MaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 31);
		Integer maxNumber = list.stream().reduce(Integer::max).get();
		Integer minNumber = list.stream().reduce(Integer::min).get();
		System.out.println("maxNumber: " + maxNumber);
		System.out.println("minNumber: " + minNumber);

		// 2nd method
		Integer maxNum1 = list.stream().reduce(1, (a, b) -> a > b ? a : b);
		Integer minNum1 = list.stream().reduce(1, (a, b) -> a < b ? a : b);
		System.out.println("maxNum1: " + maxNum1);
		System.out.println("minNum1: " + minNum1);

		// 3rd mthod
		int maxOptional = list.stream().mapToInt(i -> i).max().getAsInt();
		int minOptional = list.stream().mapToInt(i -> i).min().getAsInt();
		System.out.println("maxOptional: " + maxOptional);
		System.out.println("maxOptional: " + minOptional);

	}

}
