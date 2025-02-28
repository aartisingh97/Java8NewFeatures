package com.newFeatures.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeGrpByDept {
	String name;

	String department;

	EmployeeGrpByDept(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeGrpByDept> employees = Arrays.asList(new EmployeeGrpByDept("Alice", "HR"), new EmployeeGrpByDept("Bob", "IT"),
				new EmployeeGrpByDept("Charlie", "HR"), new EmployeeGrpByDept("David", "IT"));
		Map<String, List<EmployeeGrpByDept>> groupedByDepartment = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.department));

		groupedByDepartment.forEach((dept, emps) -> {
			System.out.println(dept + ": " + emps.stream().map(e -> e.name).collect(Collectors.toList()));
		});

	}

}
