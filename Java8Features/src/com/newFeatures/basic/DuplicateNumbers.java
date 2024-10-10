package com.newFeatures.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		Set<Integer> result = findDuplicateByCollectionsFrequency(list);
		result.forEach(System.out::println);

	}

	private static Set<Integer> findDuplicateByCollectionsFrequency(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
	}

}
