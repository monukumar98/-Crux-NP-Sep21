package Lec47;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int [] dp = new int [arr.length];
		Arrays.fill(dp, -1);
		int ans = Math.min(helper(arr, 0,dp), helper(arr, 1,dp));
		System.out.println(ans);

	}

	public static int helper(int[] arr, int i,int []dp) {
		if (i >= arr.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int x = helper(arr, i + 1,dp);
		int y = helper(arr, i + 2,dp);
		return dp[i]=Math.min(x, y) + arr[i];

	}
	
	public static int helperBU(int[] arr) {
		int [] dp = new int [arr.length];
		dp[0]=arr[0];
		dp[1]=arr[1];
		for (int i = 2; i < dp.length; i++) {
			int x = dp[i-1];
			int y = dp[i-2];
			dp[i]=Math.min(x, y) + arr[i];
		}
		
		return dp[arr.length-1];

	}

}
