package com.collections.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "c");
		map.put(2, "b");
		map.put(3, "a");

		List<Map.Entry<Integer, String>> entryList = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());
		// Print the sorted entries
		for (Map.Entry<Integer, String> entry : entryList) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
