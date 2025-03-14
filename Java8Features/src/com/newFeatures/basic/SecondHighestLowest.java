package com.newFeatures.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(0, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 40, 41);
		int secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		int secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second Highest element: " + secondHighest);
		System.out.println("Second lowest element: " + secondLowest);
		int highest = list.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
		System.out.println("Highest element: " + highest);

		System.out.println("Lowest element: " + list.stream().sorted().distinct().findFirst().get());

		System.out.println("Duplicate emements:"
				+ list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet()));

	}

}
