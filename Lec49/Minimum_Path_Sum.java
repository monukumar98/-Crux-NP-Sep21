package Lec49;

import java.util.Arrays;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(minPathSum(grid, 0, 0, dp));

	}

	public static int minPathSum(int[][] grid, int cc, int cr,int [][]dp) {
		if (cc >= grid[0].length || cr >= grid.length) {
			return Integer.MAX_VALUE;

		}
		if (cc == grid[0].length - 1 && cr == grid.length - 1) {
			return grid[cr][cc];
		}
		if(dp[cr][cc]!=-1) {
			return dp[cr][cc];
		}

		int down = minPathSum(grid, cc, cr + 1,dp);
		int right = minPathSum(grid, cc + 1, cr,dp);
		return dp[cr][cc]=Math.min(down, right) + grid[cr][cc];

	}

}
