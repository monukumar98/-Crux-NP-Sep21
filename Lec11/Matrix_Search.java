package Lec11;

import java.util.Scanner;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int item = sc.nextInt();
		int row = n - 1;
		int col = 0;
		while (row >= 0 && col < m) {
			if (arr[row][col] == item) {

				System.out.println(1);
				return;
			} else if (arr[row][col] > item) {
				row--;
			} else {
				col++;
			}

		}
		System.out.println(0);

	}

}
