package Lec20;

public class Normal_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] maze = new boolean[3][4];
		System.out.println(noofways(maze, 0, 0));

	}

	public static int noofways(boolean[][] maze, int cc, int cr) {
		if (maze.length - 1 == cr && cc == maze[0].length-1) {
              return 1;
		}
		if(cc<0 || cr<0 ||cc>=maze[0].length || cr>=maze.length || maze[cr][cc]==true) {
			return 0;
		}

		int ans = 0;
		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };
		maze[cr][cc]=true;
		for (int i = 0; i < c.length; i++) {
			 
			ans += noofways(maze, cc + c[i], cr + r[i]);

		}
		 maze[cr][cc]=false;
		
		return ans;
//		noofways(maze, cc+1, cr);
//		noofways(maze, cc, cr+1);
//		noofways(maze, cc-1, cr);
//		noofways(maze, cc, cr-1);

	}

}
