package Doubt;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(Chewbacca(n));
	}

	public static long Chewbacca(long n) {
		long ans = 0;
		long mul = 1;
		while (n !=9 && n!=0) {
			long rem = n % 10;
			if (9 - rem < rem) {
				ans = ans + (9 - rem) * mul;
			} else {
				ans = ans + rem * mul;
			}
			n = n / 10;
			mul = mul * 10;
		}
		if (n == 9) {
			ans = ans + n * mul;
		} 
		
//		else {
//			if (9 - n < n) {
//				ans = ans + (9 - n) * mul;
//			} else {
//				ans = ans + n * mul;
//			}
//		}
		return ans;

	}

}
