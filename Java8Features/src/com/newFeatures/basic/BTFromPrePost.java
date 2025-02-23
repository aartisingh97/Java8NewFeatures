package com.newFeatures.basic;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.practice.TreeNode;

public class BTFromPrePost {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] preorder = { 1, 2, 4, 5, 3, 6, 7 };
		int[] postorder = { 4, 5, 2, 6, 7, 3, 1 };
		TreeNode root = sol.constructFromPrePost(preorder, postorder);
		sol.printTree(root); // This will print the tree in inorder traversal
	}

}

class Solution {
	private Map<Integer, Integer> pos = new HashMap<>();
	private int[] preorder;

	public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
		this.preorder = preorder;
		for (int i = 0; i < postorder.length; ++i) {
			pos.put(postorder[i], i);
		}
		return dfs(0, preorder.length - 1, 0, postorder.length - 1);
	}

	private TreeNode dfs(int a, int b, int c, int d) {
		if (a > b) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[a]);
		if (a == b) {
			return root;
		}
		int i = pos.get(preorder[a + 1]);
		int m = i - c + 1;
		root.left = dfs(a + 1, a + m, c, i);
		root.right = dfs(a + m + 1, b, i + 1, d - 1);
		return root;
	}

	public void printTree(TreeNode root) {
		if (root != null) {
			System.out.print(root.val + " "); // Print root
			printTree(root.left); // Print left subtree
			printTree(root.right); // Print right subtree
		}
	}
}
