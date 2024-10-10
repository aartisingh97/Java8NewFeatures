package com.newFeatures.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(2, 222, 234, 567, 890, 432, 236, 211, 22);
		List<Integer> numwith2 = numbers.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("List of number start with 2: "
				+ Arrays.toString(numwith2.toArray()).replace("[", "").replace("]", ""));
	}

}
