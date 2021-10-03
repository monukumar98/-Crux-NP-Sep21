package Lec5;

public class Dec_to_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 69;
		int mul=1;
		int ans=0;
		while(n!=0) {
			int rem = n%2;
			ans = ans+rem*mul;
			n=n/2;
			mul=mul*10;
		}
		System.out.println(ans);	
			

	}

}
