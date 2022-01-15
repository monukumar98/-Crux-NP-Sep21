package Lec28;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		Reverse(s);
		System.out.println("....................");
		System.out.println(s);
	}

	public static void Reverse(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}

		int i = s.pop();
		Reverse(s);
		InsertBottom(s, i);

	}
	

	private static void InsertBottom(Stack<Integer> s, int i) {
		// TODO Auto-generated method stub

		if (s.isEmpty()) {
			s.push(i);
			return;
		}
		int item = s.pop();
		InsertBottom(s, i);
		s.push(item);

	}

}
