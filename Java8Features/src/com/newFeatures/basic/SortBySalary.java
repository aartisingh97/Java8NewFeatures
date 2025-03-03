package com.newFeatures.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBySalary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(new Employee("Alice", 5000), new Employee("Bob", 3000),
				new Employee("Charlie", 4000));

		List<Employee> sorted = employees.stream().sorted(Comparator.comparingInt(e -> e.salary)).toList();
		System.out.println(sorted);
	}
}

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + ":" + salary;
	}

}
