package Lec48;

import java.util.Arrays;

public class Coin_Change_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2, 4, 3, 5 };
		int amount = 10;
		int[][] dp = new int[amount + 1][coins.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(changes(amount, coins, 0, dp));

	}

	public static int changes(int amount, int[] coins, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == coins.length) {
			return 0;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= coins[i]) {
			inc = changes(amount - coins[i], coins, i, dp);// dp[amount - coins[i]][i]
		}
		exc = changes(amount, coins, i + 1, dp);// dp[amount][i-1]
		return dp[amount][i] = inc + exc;

	}

	public static int changesBu(int amount, int[] coins) {

		int[][] dp = new int[amount + 1][coins.length+1];
		for (int i = 0; i <= coins.length; i++) {
			dp[0][i] = 1;
		}
		for (int am = 1; am <= amount; am++) {// am -- amount
			for (int i = 1; i <= coins.length; i++) {
				int inc = 0;
				int exc = 0;
				if (am >= coins[i-1]) {
					inc = dp[am - coins[i-1]][i];

				}
				exc = dp[am][i-1];
				dp[am][i]=inc+exc;

			}
		}
		return dp[amount][coins.length];

	}
}
