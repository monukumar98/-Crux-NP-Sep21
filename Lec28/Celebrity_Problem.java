package Lec28;

import java.util.Stack;

public class Celebrity_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
       System.out.println(Celebrity(arr));
	}

	public static int Celebrity(int [][]arr) {
		
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			s.push(i);
		}
		
		
		while(s.size()!=1) {
			int a = s.pop();
			int b=s.pop();
			if(arr[a][b]==1) {
				s.push(b);
			}
			else {
				s.push(a);
			}
			
		}
		int candidate=s.pop();
		for (int i = 0; i < arr.length; i++) {
			if(i!=candidate && (arr[candidate][i]==1 || arr[i][candidate]==0)) {
				return -1;
			}
			
		}
		return candidate;
		
	}

}
