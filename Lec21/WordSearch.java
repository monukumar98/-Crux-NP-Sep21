package Lec21;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				boolean ans = Word_search(grid, word, i, j, 0);
				if (ans == true) {
					System.out.println(ans);
					return;
				}
			}

		}
		System.out.println(false);

	}

	public static boolean Word_search(char[][] grid ,String word, int cc, int cr, int idx) {
		// TODO Auto-generated method stub

		if(idx==word.length()) {
			return true;
		}
		
		
		if(cc<0 || cc>=grid[0].length || cr<0 || cr>=grid.length || grid[cr][cc]!=word.charAt(idx)) {
			return false;
			
		}
		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };
		
		grid[cr][cc]='*';
		
		for (int i = 0; i < c.length; i++) {
			boolean ans = Word_search(grid, word, cc+c[i], cr+r[i], idx+1);
			if(ans) {
				return ans;
			}
			
		}
		grid[cr][cc]=word.charAt(idx);
		
		return false;
	}

}
