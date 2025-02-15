package com.leetcode.practice;

public class PunishmentNumber {

	public static void main(String[] args) {
		int nums = 37;
		int sumOfPunishmentNumber = punishmentNumber(nums);

		System.out.println("sumOfPunishmentNumber::::::" + sumOfPunishmentNumber);
	}

	// TODO Auto-generated method stub
	public static int punishmentNumber(int n) {
		int totalPunishmentSum = 0; // Renamed 'ans' to 'totalPunishmentSum' for clarity
		for (int i = 1; i <= n; ++i) {
			int squaredNumber = i * i; // Renamed 'x' to 'squaredNumber'
			if (isPunishmentNumber(Integer.toString(squaredNumber), 0, i)) { // Renamed 'check' to 'isPunishmentNumber'
				totalPunishmentSum += squaredNumber;
			}
		}
		return totalPunishmentSum;
	}

	private static boolean isPunishmentNumber(String numberString, int startIndex, int targetSum) {
		int length = numberString.length(); // Renamed 'm' to 'length'
		if (startIndex >= length) {
			return targetSum == 0; // Renamed 'x' to 'targetSum'
		}
		int partialSum = 0; // Renamed 'y' to 'partialSum'
		for (int endIndex = startIndex; endIndex < length; ++endIndex) { // Renamed 'j' to 'endIndex'
			partialSum = partialSum * 10 + (numberString.charAt(endIndex) - '0');
			if (partialSum > targetSum) {
				break;
			}
			if (isPunishmentNumber(numberString, endIndex + 1, targetSum - partialSum)) {
				return true;
			}
		}
		return false;
	}
}
