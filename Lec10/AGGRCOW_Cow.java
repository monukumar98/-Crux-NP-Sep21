package Lec10;

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW_Cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0) {
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int[] stalls = new int[nos];
		for (int i = 0; i < stalls.length; i++) {
			stalls[i] = sc.nextInt();
		}
		Arrays.sort(stalls);
		System.out.println(largest_minimum_distance(stalls, noc));
		t--;
		}
	}

	public static int largest_minimum_distance(int[] stall, int noc) {
		int lo = 0;
		int hi = stall[stall.length - 1] - stall[0];
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (is_it_possible(stall, mid, noc)) {
				ans = mid;
				lo = mid + 1;

			} else {
				hi = mid - 1;

			}
		}
		return ans;

	}

	public static boolean is_it_possible(int[] stall, int mid, int nos) {
		// TODO Auto-generated method stub
		int place=stall[0];
		int cow=1;
		int i=1;
		while(i<stall.length) {
			if(stall[i]-place>=mid) {
				place=stall[i];
				cow++;
			}
			if(cow==nos) {
				return true;
			}
			i++;
		}
		return false;
	}
}
