package Lec17;

public class Coin_Toss_Without_Two_head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		CoinToss(n, "");
	}

	public static void CoinToss(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		CoinToss(n-1, ans+"T");
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
		CoinToss(n-1, ans+"H");
		}
		
	}
}
