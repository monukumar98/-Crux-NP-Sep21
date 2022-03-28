package Lec48;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "ace";
		int dp[][] = new int[s1.length()][s2.length()];
		System.out.println(lcs(s1, s2, 0, 0, dp));
		System.out.println(lcsback(s1, s2, s1.length(), s2.length(), dp));

	}

	public static int lcs(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}

		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {

			ans = 1 + lcs(s1, s2, i + 1, j + 1, dp);// dp[i-1][j-1]
		} else {
			int fs = lcs(s1, s2, i + 1, j, dp);// dp[i-1][j]
			int ss = lcs(s1, s2, i, j + 1, dp);// dp[i][j-1]
			ans = Math.max(fs, ss);

		}
		return dp[i][j] = ans;
	}

	public static int lcsback(String s1, String s2, int i, int j, int[][] dp) {
		if (i == 0 || j == 0) {
			return 0;
		}

		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

			ans = 1 + lcsback(s1, s2, i - 1, j - 1, dp);// dp[i-1][j-1]
		} else {
			int fs = lcsback(s1, s2, i - 1, j, dp);// dp[i-1][j]
			int ss = lcsback(s1, s2, i, j - 1, dp);// dp[i][j-1]
			ans = Math.max(fs, ss);

		}
		return dp[i][j] = ans;
	}

	public static int  lcsBU(String s1, String s2){
		int dp[][] = new int [s1.length()+1][s2.length()+1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					
					dp[i][j] =  1 +  dp[i-1][j-1];
				}
				else {
					int fs =  dp[i-1][j];
					int ss = dp[i][j-1];
					dp[i][j] = Math.max(fs, ss);
				}
			}
			
		}
		return dp[s1.length()][s2.length()];
		
	}

}
