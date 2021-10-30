package Lec13;

import java.util.ArrayList;

public class Diagonal_Traverse {
	public static void main(String[] args) {

	}

	public static int[] DiagonalTraverse(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int[] ans = new int[n * m];
		int idx=0;
		for (int d = 0; d < m + n - 1; d++) {
			int row = 0;
			int col = 0;
			if (d < m) {
				row = 0;
				col = d;
			} else {
				row = d - m + 1;
				col = m - 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while(row<n && col>=0) {
				list.add(arr[row][col]);
				row++;
				col--;
				
			}
			if(d%2!=0) {
			for (int i = 0; i < list.size(); i++) {
				ans[idx]=list.get(i);
				idx++;
				
			}
			}
			else {
				
				for (int i = list.size()-1; i>=0; i--) {
					ans[idx]=list.get(i);
					idx++;
				}
			}

		}
		return ans;

	}

}
