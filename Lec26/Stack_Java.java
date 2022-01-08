package Lec26;
import java.util.Stack;
public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(40);
		s.push(50);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());

	}

}
