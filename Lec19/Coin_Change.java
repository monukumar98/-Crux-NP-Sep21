package Lec19;

public class Coin_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin= {2,3,5,6};
		CoinPermutation(coin, 10, "");
		
		

	}
	public static  void CoinPermutation(int [] coin, int amount,String ans) {
		
		if(amount==0) {
			System.out.println(ans);
			return ;
		}
		
		for (int i = 0; i < coin.length; i++) {
			
			if(amount>=coin[i]) {
				CoinPermutation(coin, amount-coin[i], ans+coin[i]);
			}
			
		}
		
	}

}
