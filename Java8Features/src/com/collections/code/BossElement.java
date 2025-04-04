package com.collections.code;

public class BossElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 31, 4, 7, 15, 1, 8, 9 };
		int highest[] = null;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i + 1; j <= arr.length; j++) {

				if (arr[i] <= arr[j])
					break;
			}
			if (j == arr.length) {

			}

		}

		System.out.println(highest);

	}

}
