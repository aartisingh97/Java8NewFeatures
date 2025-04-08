package com.begin.ArrayAndMatrics;

public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 20, 3, 70, 45, 4, 125 };

		int min = a[0], max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Max: " + max + "  Min: " + min);
	}

}
