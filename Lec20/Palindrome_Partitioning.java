package Lec20;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> ans = new ArrayList<>();
		List<List<String>> list = new ArrayList<>();
		PalindromePartitioning(str, ans,list);
		System.out.println(list);

	}

	public static void PalindromePartitioning(String ques, List<String> ans,List<List<String>> list ) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			//System.out.println(ans);
			list.add(new ArrayList<>(ans));
			//System.out.println(list);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String ros = ques.substring(0, i);
			if (isPalindrome(ros)) {
				ans.add(ros);
				PalindromePartitioning(ques.substring(i), ans,list);
				ans.remove(ans.size()-1);
			}

		}

	}

	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;

	}

}
