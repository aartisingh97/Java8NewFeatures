package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostProfitablePath {
	private List<Integer>[] g;
	private int[] amount;
	private int[] ts;
	private int ans = Integer.MIN_VALUE;

	public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
		int n = edges.length + 1;
		g = new List[n];
		ts = new int[n];
		this.amount = amount;
		Arrays.setAll(g, k -> new ArrayList<>());
		Arrays.fill(ts, n);

		// Build the graph from edges
		for (var e : edges) {
			int a = e[0], b = e[1];
			g[a].add(b);
			g[b].add(a);
		}

		// Start the first DFS to compute the time stamps
		dfs1(bob, -1, 0);

		// Set the timestamp for the node where Bob starts
		ts[bob] = 0;

		// Start the second DFS to compute the maximum profitable path
		dfs2(0, -1, 0, 0);

		// Print the result
		System.out.println("Most profitable path value: " + ans);
		return ans;
	}

	private boolean dfs1(int i, int fa, int t) {
		if (i == 0) {
			ts[i] = Math.min(ts[i], t);
			return true;
		}
		for (int j : g[i]) {
			if (j != fa && dfs1(j, i, t + 1)) {
				ts[j] = Math.min(ts[j], t + 1);
				return true;
			}
		}
		return false;
	}

	private void dfs2(int i, int fa, int t, int v) {
		// Adjust the value based on Bob's position
		if (t == ts[i]) {
			v += amount[i] >> 1; // Half of the amount
		} else if (t < ts[i]) {
			v += amount[i]; // Full amount
		}

		// Check if it's a leaf node
		if (g[i].size() == 1 && g[i].get(0) == fa) {
			ans = Math.max(ans, v); // Update the maximum profit
			return;
		}

		// Explore all neighbors
		for (int j : g[i]) {
			if (j != fa) {
				dfs2(j, i, t + 1, v);
			}
		}
	}

	public static void main(String[] args) {
		MostProfitablePath mostProfitablePath = new MostProfitablePath();

		// Example input
		int[][] edges = { { 0, 1 }, { 1, 2 }, { 1, 3 }, { 3, 4 } };
		int bob = 3;
		int[] amount = { -2, 4, 2, -4, 6 };

		// Call the method and print the result
		int result = mostProfitablePath.mostProfitablePath(edges, bob, amount);
		System.out.println("Result: " + result);
	}

}
