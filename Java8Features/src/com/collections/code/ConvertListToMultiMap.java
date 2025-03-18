package com.collections.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMultiMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudentList> stList = Arrays.asList(new StudentList(1, "Aarti"), new StudentList(1, "Gunja"),
				new StudentList(2, "Dhananjay"), new StudentList(2, "Anjani"), new StudentList(3, "Pooja"));

		Map<Integer, List<String>> multiMap = stList.stream().collect(Collectors.groupingBy(StudentList::getId,
				Collectors.mapping(StudentList::getName, Collectors.toList())));

		System.out.println("Covert List to multimap based on id:::" + multiMap);
	}

}

class StudentList {
	int id;
	String name;

	StudentList(int id, String name) {
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
