package com.newFeatures.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByStudentName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stList = Arrays.asList(new Student("Shanu", 109, 23), new Student("Kratika", 106, 34),
				new Student("Aarti", 103, 26), new Student("Gunjan", 101, 27));

		Collections.sort(stList, (s1, s2) -> s1.name.compareTo(s2.name));
		stList.stream().forEach(n -> System.out.println(n.name + " " + n.id + " " + n.age));
	}

}

class Student {
	String name;
	int id;
	int age;

	Student(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
}
