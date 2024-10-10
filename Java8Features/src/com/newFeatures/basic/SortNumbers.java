package com.newFeatures.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(0, 3, 10, 20, 30, 15, 15, 1, 13, 2, 2, 10, 40, 19, 3, 40);
		List<Integer> ascSorting = list.stream().sorted().collect(Collectors.toList());
		List<Integer> descSorting = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

		System.out.println("Sorted in Ascending Order: "
				+ Arrays.toString(ascSorting.toArray()).replace("[", "").replace("]", ""));
		System.out.println("Sorted in Descending Order: "
				+ Arrays.toString(descSorting.toArray()).replace("[", "").replace("]", ""));
	}

}
