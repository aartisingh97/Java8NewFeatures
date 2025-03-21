package com.newFeatures.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		Set uniqueItem = new HashSet<>();
		List<Integer> duplicateRemovedList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Using distinct():::" + duplicateRemovedList);

		System.out.println("Using Set:::" + list.stream().filter(n -> uniqueItem.add(n)).collect(Collectors.toSet()));
	}

}
