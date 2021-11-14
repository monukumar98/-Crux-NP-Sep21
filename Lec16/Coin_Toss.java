package Lec16;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		Coin_Toss(n, "");

	}
	public static void Coin_Toss(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		Coin_Toss(n-1, ans+"T");
		Coin_Toss(n-1, ans+"H");
		
	}

}
