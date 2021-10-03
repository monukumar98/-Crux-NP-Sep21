package Lec5;

public class Bintodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1000101;
		int mul=1;
		int ans=0;
		while(n!=0) {
			int rem = n%10;
			ans = ans+rem*mul;
			n=n/10;
			mul=mul*2;
		}
		System.out.println(ans);	
			

	}

}
