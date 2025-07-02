package com.dsa.tree;

public class ArrayToBST {

	// Recursive function to construct BST
	static Node sortedArrayToBSTRecur(int[] arr, int start, int end) {
		if (start > end)
			return null;

		// Find the middle element
		int mid = start + (end - start) / 2;

		// Create root node
		Node root = new Node(arr[mid]);

		// Create left subtree
		root.left = sortedArrayToBSTRecur(arr, start, mid - 1);

		// Create right subtree
		root.right = sortedArrayToBSTRecur(arr, mid + 1, end);

		return root;
	}

	static Node sortedArrayToBST(int[] arr) {
		return sortedArrayToBSTRecur(arr, 0, arr.length - 1);
	}

	static void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		Node root = sortedArrayToBST(arr);
		preOrder(root);
	}

}
