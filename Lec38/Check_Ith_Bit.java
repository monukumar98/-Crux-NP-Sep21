package Lec38;

public class Check_Ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= -83;
		int i = 4;
		checkbit(n, i);

	}
	public static void checkbit(int n, int i) {
		
		int mask = (1<<i);
		if((n&mask)!=0) {
			System.out.println("setbit");//1
		}
		else {
			System.out.println("unsetbit");//0
		}
		
	}

}
