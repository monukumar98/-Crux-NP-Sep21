package Lec14;

import java.util.Scanner;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           while(t-->0) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		DivisibleSubarrays(arr, n);
		
		
           }

	}

	public static void DivisibleSubarrays(int[] arr, int n) {
		// TODO Auto-generated method stub
		int[] ans = new int[n];
		int sum = 0;
		ans[0] = 1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			sum = sum % n;
			if(sum<0) {
				sum+=n;
				
			}
		
			ans[sum]++;// ans[sum] = ans[sum]+1;

		}
		long res = 0;

		for (int i = 0; i < ans.length; i++) {
			if (ans[i] >= 2) {
				int p = ans[i];
				res = res + (p * (p - 1)) / 2;

			}

		}
		System.out.println(res);

	}

}
