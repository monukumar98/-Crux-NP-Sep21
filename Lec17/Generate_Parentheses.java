package Lec17;

import java.util.*;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		GenerateParentheses(n, "", 0, 0);
		List<String> list = new ArrayList<>();

	}

	public static void GenerateParentheses(int n, String ans, int open, int close) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (open < n) {
			GenerateParentheses(n, ans + "(", open + 1, close);
		}

		if (close < open) {
			GenerateParentheses(n, ans + ")", open, close + 1);
		}
	}
	
	
	public static void GenerateParentheses_leetcode(int n, String ans, int open, int close,List<String> list) {
		if (open == n && close == n) {
			//System.out.println(ans);
			list.add(ans);
			return;
		}

		if (open < n) {
			GenerateParentheses_leetcode(n, ans + "(", open + 1, close,list);
		}

		if (close < open) {
			GenerateParentheses_leetcode(n, ans + ")", open, close + 1,list);
		}
	}


}
