package com.collections.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentData> list = Arrays.asList(new StudentData(1, "Aarti"), new StudentData(2, "Gunja"),
				new StudentData(3, "Anju"));
		Map<Integer, String> map = new HashMap<>();
		for (StudentData st : list) {
			map.put(st.getId(), st.getName());
		}
		System.out.println("Map using enhanced for loop::" + map);

		// uisng java 8 Collectors.toMap()

		Map<Integer, String> hashmap = list.stream()
				.collect(Collectors.toMap(StudentData::getId, StudentData::getName));
		System.out.println("Map using Collectors.toMap()::" + hashmap);
	}

}

class StudentData {
	int id;
	String name;

	StudentData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
