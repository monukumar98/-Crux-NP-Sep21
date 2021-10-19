package Lec10;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int nob = sc.nextInt();
			int nos = sc.nextInt();// number of student
			int[] page = new int[nob];
			for (int i = 0; i < page.length; i++) {
				page[i] = sc.nextInt();
			}
       System.out.println(min_page(page, nos));
			t--;
		}

	}

	public static int min_page(int[] page, int nos) {
		int lo = 0;
		int hi = 0;
		for (int val : page) {
			hi += val;
		}
		int ans = 0;
		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (is_it_possible(page, mid, nos)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}

	public static boolean is_it_possible(int[] page, int mid, int nos) {
		int student =1;
		int read_page=0;
		int i=0;
		while(i<page.length) {
			if(read_page+page[i]<=mid) {
				read_page+=page[i];
				i++;
			}
			else {
				student++;
				read_page=0;
			}
			
			if(student>nos) {
				return false;
			}
			
		}
		return true;
	}

}
