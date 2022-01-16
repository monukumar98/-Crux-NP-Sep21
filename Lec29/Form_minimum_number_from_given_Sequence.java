package Lec29;

import java.util.Stack;

public class Form_minimum_number_from_given_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "DDIIIDI";
		Form_minimum_number(str);

	}

	public static void Form_minimum_number(String str) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i <= str.length(); i++) {
			s.push(i + 1);
			if (i == str.length() || str.charAt(i) == 'I') {
				while (!s.isEmpty()) {
					System.out.print(s.pop());
				}
			}
		}
		System.out.println();
	}

}
