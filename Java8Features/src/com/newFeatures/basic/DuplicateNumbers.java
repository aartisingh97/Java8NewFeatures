package com.newFeatures.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		Set<Integer> result = findDuplicateByCollectionsFrequency(list);
		result.forEach(System.out::println);
		Set item = new HashSet<>();

		System.out.println("1. Anaother way of finding duplicates"
				+ list.stream().filter(n -> !item.add(n)).collect(Collectors.toSet()));

		System.out.println("2. Another way of finding duplicates" + list.stream()
				// Group the elements along
				// with their frequency in a map
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

				// Convert this map into a stream
				.entrySet().stream()

				// Check if frequency > 1
				// for duplicate elements
				.filter(m -> m.getValue() > 1)

				// Find such elements
				.map(Map.Entry::getKey)

				// And Collect them in a Set
				.collect(Collectors.toSet()));

	}

	private static Set<Integer> findDuplicateByCollectionsFrequency(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
	}

}
