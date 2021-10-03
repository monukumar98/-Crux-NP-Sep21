package Lec5;

import java.util.Scanner;


public class Anybase_to_Anybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int src = sc.nextInt();
		int dest=sc.nextInt();
		 int c=  Srcto10(n,src);
		  int ans= base10toDest(c,dest);
		  System.out.println(ans);

	}

	public static int base10toDest(int n, int dest) {
		// TODO Auto-generated method stub
		int ans=0;
		int mul=1;
		while(n!=0) {
			int rem = n%dest;
			ans= ans + rem*mul;
			n/=dest;
			mul*=10;
		}
		return ans;
	}

	public static int Srcto10(int n, int src) {
		// TODO Auto-generated method stub
		int ans=0;
		int mul=1;
		while(n!=0) {
			int rem = n%10;
			ans= ans + rem*mul;
			n/=10;
			mul*=src;
		}
		
		return ans;
	}

}
