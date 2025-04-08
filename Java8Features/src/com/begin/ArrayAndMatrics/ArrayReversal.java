package com.begin.ArrayAndMatrics;

public class ArrayReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 5, 3, 6 };

		int reversed[] = new int[arr.length];

		for (int i = 0, j = arr.length; i < arr.length; i++, j--) {
			reversed[j - 1] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(reversed[i] + " ");
		}

	}

}
