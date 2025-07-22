package com.dsa.tree;

public class MaxGCDOfSibling {
	// Find out gcd
	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	// Helper function to find the
	// maximum GCD in the tree
	private static int maxGCDHelper(TreeNode root, int[] ans) {
		if (root == null)
			return 0;
		int leftGCD = maxGCDHelper(root.left, ans);
		int rightGCD = maxGCDHelper(root.right, ans);
		if (leftGCD != 0 && rightGCD != 0) {
			int siblingsGCD = gcd(leftGCD, rightGCD);
			ans[0] = Math.max(ans[0], siblingsGCD);
		}
		return (root.left != null) ? gcd(root.val, leftGCD) : root.val;
	}

	// Function to find the maximum GCD in the tree
	public static int maxGCD(TreeNode root) {
		int[] ans = { 0 };
		// Store the result in an array to
		// pass by reference
		maxGCDHelper(root, ans);
		return ans[0];
	}

	// Driver code
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(20);
		// Function call
		System.out.println(maxGCD(root));
	}
}

//Definition of TreeNode
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}
