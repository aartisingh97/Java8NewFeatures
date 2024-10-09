package com.newFeatures.basic;

import java.util.Arrays;
import java.util.List;

public class AverageOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Average is:" + avg);

	}

}
