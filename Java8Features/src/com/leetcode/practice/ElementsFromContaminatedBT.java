package com.leetcode.practice;

import java.util.HashSet;
import java.util.Set;

public class ElementsFromContaminatedBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(-1); // Root is initially invalid (val = -1)
		root.left = new TreeNode(-1); // Left child of root
		root.right = new TreeNode(-1); // Right child of root
		root.left.left = new TreeNode(-1); // Left child of left child
		root.left.right = new TreeNode(-1); // Right child of left child

		FindElements elements = new FindElements(root);
		System.out.println(elements.find(1)); // Should return true if the value is found
		System.out.println(elements.find(2)); // Should return true if the value is found
		System.out.println(elements.find(3)); // Should return false if the value is not found
		System.out.println(elements.find(5)); // Should return false if the value is not found
		System.out.println(elements.find(7)); // Should return true if the value is found

	}

}

class FindElements {
	private Set<Integer> s = new HashSet<>();

	public FindElements(TreeNode root) {
		root.val = 0;
		dfs(root);
	}

	public boolean find(int target) {
		return s.contains(target);
	}

	private void dfs(TreeNode root) {
		s.add(root.val);
		if (root.left != null) {
			root.left.val = root.val * 2 + 1;
			dfs(root.left);
		}
		if (root.right != null) {
			root.right.val = root.val * 2 + 2;
			dfs(root.right);
		}
	}
}
