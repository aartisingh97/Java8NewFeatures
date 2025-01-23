package com.newFeatures.basic;

public class MostRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] element= {2,3,1,2,4,5,7,3,3,5,9,8,6,4,3,9,8};
		
		Function<Map<Integer,Long>,Integer> maxValuesKey=integerlongMap->integerLongMap.entrySet().stream()
				.max(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey)
		.orElse(Integer.MAX_VALUE);
		

	}

}
