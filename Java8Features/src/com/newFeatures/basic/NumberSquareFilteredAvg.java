package com.newFeatures.basic;

import java.util.Arrays;
import java.util.List;

//step-1 input:- 1, 10, 20, 30, 15
//step-2 square:- 1,100,400,900,225
//avgOf number square which is greater than 100:- 1523/3=508.333
public class NumberSquareFilteredAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 10, 20, 30, 15);
		double avg = list.stream().map(n -> n * n).filter(n -> n > 100).mapToInt(e -> e).average().getAsDouble();
		System.out.println("Avg of number square which is greater than 100: " + avg);
	}

}
