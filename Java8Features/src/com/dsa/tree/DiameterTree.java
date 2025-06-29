package com.dsa.tree;

public class DiameterTree {

	// Function to compute the height of a tree.
	static int height(Node root) {

		// Base case: tree is empty
		if (root == null)
			return 0;

		// If tree is not empty then height = 1 +
		// max of left height and right heights
		return 1 + Math.max(height(root.left), height(root.right));
	}

	// Function to get diameter of a binary tree
	static int diameter(Node root) {
		if (root == null)
			return 0;

		// Get the height of left and right sub-trees
		int lheight = height(root.left);
		int rheight = height(root.right);

		// Get the diameter of left and right sub-trees
		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);

		// Return max of the following three:
		// 1) Diameter of left subtree
		// 2) Diameter of right subtree
		// 3) Height of left subtree + height
		// of right subtree
		return Math.max(lheight + rheight, Math.max(ldiameter, rdiameter));
	}

	public static void main(String[] args) {

		// Constructed binary tree is
		// 5
		// / \
		// 8 6
		// / \ /
		// 3 7 9
		Node root = new Node(5);
		root.left = new Node(8);
		root.right = new Node(6);
		root.left.left = new Node(3);
		root.left.right = new Node(7);
		root.right.left = new Node(9);

		System.out.println(diameter(root));
	}

}
