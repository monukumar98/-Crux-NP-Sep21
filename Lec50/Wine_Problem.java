package Lec50;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wine[] = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
		System.out.println(maxProfit(wine, 0, wine.length - 1, 1, dp));
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static int maxProfit(int[] price, int i, int j, int year, int[][] dp) {
		// TODO Auto-generated method stub
         if(i>j) {
        	 return 0;
         }
         if(dp[i][j]!=0) {
        	 return dp[i][j];
         }
		int first = price[i] * year + maxProfit(price, i + 1, j, year + 1, dp);
		int last = price[j] * year + maxProfit(price, i, j - 1, year + 1, dp);

		return dp[i][j] = Math.max(last, first);

		
	}

}
