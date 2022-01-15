package Lec28;

import java.util.Arrays;
import java.util.Stack;

public class Stock_Span {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 10, 12, 4, 15, 8, 9 };
		span(arr);

	}

	public static void span(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			// span cal
			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				s.pop();

			}
			if (s.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - s.peek();
			}
			s.push(i);

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ans));
		
		

	}

}
