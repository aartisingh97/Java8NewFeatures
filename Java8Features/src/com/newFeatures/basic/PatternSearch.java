package com.newFeatures.basic;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class PatternSearch {
	// Using a 256 sized array of hash sets.
	private HashSet<Integer>[] structuredText = new HashSet[256];

	// Function to perform the hashing
	public void stringSearch(String st) {
		// Structure the text. It will be helpful in pattern searching
		for (int i = 0; i < 256; i++) {
			structuredText[i] = new HashSet<Integer>();
		}

		// Insert every index to the hash set using character ASCII.
		for (int i = 0; i < st.length(); i++) {
			structuredText[(int) st.charAt(i)].add(i);
		}
	}

	// Function to search the pattern
	public void patternSearch(String st, String pattern) {
		stringSearch(st);

		// Queue to contain the indices
		Queue<Integer> qIndices = new LinkedList<Integer>();

		for (int ind : structuredText[(int) pattern.charAt(0)]) {
			qIndices.add(ind);
		}

		// Pattern length
		int patLen = pattern.length();
		for (int i = 1; i < patLen; i++) {
			char ch = pattern.charAt(i);
			int qSize = qIndices.size();

			// The queue contains the number of occurrences of the previous character.
			// Traverse the queue for q_size times.
			// Check the next character of the pattern found or not.
			while (qSize > 0) {
				qSize--;
				int ind = qIndices.peek();
				qIndices.remove();

				if (structuredText[(int) ch].contains(ind + 1)) {
					qIndices.add(ind + 1);
				}
			}
		}

		System.out.print("Pattern found at indexes: ");
		while (!qIndices.isEmpty()) {
			// lastInd is the last index of the pattern in the text
			int lastInd = qIndices.peek();
			qIndices.remove();
			System.out.print(lastInd - (patLen - 1) + " ");
		}
		System.out.println();
	}

	// Driver code
	public static void main(String[] args) {
		PatternSearch ps = new PatternSearch();

		// Passing the Text
		String text = "A blend of Natural Sandalwood oil and Richness of Almond oil";

		String pattern = "oil";

		// Function call
		ps.patternSearch(text, pattern);
	}
}
