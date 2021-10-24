package Lec12;

import java.util.Scanner;

public class Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		GoodString(str);
		
		
				

	}
	public static void GoodString(String str) {
		int ans=0;
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(is_vowels(ch)) {
				count++;
			}
			else {
				ans=Math.max(ans, count);
				count=0;
			}
			
		}
		ans=Math.max(ans, count);
		System.out.println(ans);
		
		
		
	}
	
	public static boolean is_vowels (char a) {
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			return true;
		}
		return false;
	}

}
