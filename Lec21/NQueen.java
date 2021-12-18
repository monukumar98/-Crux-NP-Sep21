package Lec21;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		Nqueen(board, 0, n);

	}

	public static void Nqueen(boolean[][] board, int row, int n) {
		if (n == 0) {
			
			Display(board);
			return;

		}

		for (int col = 0; col < board.length; col++) {
			
			if (issafe(board, row, col)) {
				
				board[row][col] = true;
				Nqueen(board, row + 1, n - 1);
				board[row][col] = false;

			}

		}

	}

	public static boolean issafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// Col is Safe or Not Safe
		int r = row;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		// Right Diagonal
		r = row;
		c = col;
		while (r >= 0 && c < board.length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		// left Diagonal
		r = row;
		c = col;
		while (r >= 0 && c>=0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println();

	}

}
