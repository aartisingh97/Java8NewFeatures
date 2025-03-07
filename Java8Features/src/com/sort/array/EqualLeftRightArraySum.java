package com.sort.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqualLeftRightArraySum {
	public static int findElement(int arr[], int n) {

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		for (int i = 1; i <= n; i++) {

			int leftSum = list.subList(0, i).stream().mapToInt(a -> a).sum();

			int rightSum = list.subList(i + 1, n).stream().mapToInt(b -> b).sum();
			if (leftSum == rightSum) {
				return list.get(i);
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 4, 2, 5 };

		int n1 = arr1.length;

		System.out.println(findElement(arr1, n1));

		int arr2[] = { 2, 3, 4, 1, 4, 5 };

		int n2 = arr2.length;

		System.out.println(findElement(arr2, n2));
	}

}
