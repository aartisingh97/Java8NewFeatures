package com.sort.array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 5, 3, 9, 7, 5 };
		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

		System.out.println("After Sorting");
		for (int number : numbers) {
			System.out.print(number + " ");
		}

	}

}
