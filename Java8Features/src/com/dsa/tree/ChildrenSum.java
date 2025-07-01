package com.dsa.tree;

public class ChildrenSum {

	// returns 1 if children sum property holds
	// for the given node and both of its children
	static int isSumProperty(Node root) {

		// If root is NULL or it's a leaf node
		// then return true
		if (root == null || (root.left == null && root.right == null))
			return 1;

		int sum = 0;

		// If left child is not present then 0
		// is used as data of left child
		if (root.left != null)
			sum += root.left.data;

		// If right child is not present then 0
		// is used as data of right child
		if (root.right != null)
			sum += root.right.data;

		// if the node and both of its children
		// satisfy the property return 1 else 0
		return ((root.data == sum) && (isSumProperty(root.left) == 1) && (isSumProperty(root.right) == 1)) ? 1 : 0;
	}

	public static void main(String[] args) {

		// Create a hard coded tree.
		// 35
		// / \
		// 20 15
		// / \ / \
		// 15 5 10 5
		Node root = new Node(35);
		root.left = new Node(20);
		root.right = new Node(15);
		root.left.left = new Node(15);
		root.left.right = new Node(5);
		root.right.left = new Node(10);
		root.right.right = new Node(5);

		System.out.println(isSumProperty(root));
	}

}
