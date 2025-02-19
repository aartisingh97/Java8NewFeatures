package com.sort.array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 5, 3, 9, 7, 5 };
		int temp = 0;
		int minIndex = 0;

		for (int i = 0; i < numbers.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[minIndex] > numbers[j]) {
					minIndex = j;
				}
			}
			temp = numbers[minIndex];
			numbers[minIndex] = numbers[i];
			numbers[i] = temp;

		}

		System.out.println("After Sorting");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

}
