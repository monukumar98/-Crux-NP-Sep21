package Lec27;

import Lec20.Normal_maze;

public class Static_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hey");
		System.out.println(Normal_maze.noofways(new boolean[4][4], 0, 0));
	}

	static {
		System.out.println("hello");
	}

}
