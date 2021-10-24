package Lec11;

import java.util.Scanner;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(no_good_subarray(arr));
		t--;
		}
	}

	public static int no_good_subarray(int[] arr) {
		int n = arr.length;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			long sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum % n == 0) {
					ans++;
				}

			}

		}
		return ans;

	}

}
