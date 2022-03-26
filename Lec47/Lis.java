package Lec47;

import java.util.Arrays;

public class Lis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };

	}

	public static int lengthOfLIS(int [] arr) {
		
		int [] dp = new int [arr.length];
		Arrays.fill(dp, 1);
		for (int i = 1; i < dp.length; i++) {
			int max=1;
			for (int j = i-1; j>=0; j--) {
				if(arr[i]>arr[j]) {
				max = Math.max(dp[j]+1, max);
				}
			}
			dp[i]=max;
			
		}
		int ans=dp[0];
		for (int i = 1; i < dp.length; i++) {
			if(dp[i]>ans) {
				ans=dp[i];
			}
		}
		return ans;
		
		
	}

}
