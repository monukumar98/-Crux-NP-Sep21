package Lec11;

public class Tranpose_of_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		Tranpose(arr);
		System.out.println(",,,,,,,,,,,,,,,,,");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}

	public static void Tranpose(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr.length; col++) {
				int t = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = t;

			}

		}
	}

}
