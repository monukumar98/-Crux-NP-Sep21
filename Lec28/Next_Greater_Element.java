package Lec28;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 15,11, 9, 13, 21, 3 };
		System.out.println(Arrays.toString(arr));
		NGE(arr);
		

	}



	public static void NGE(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			// span cal
			while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
				ans[s.pop()] = arr[i];

			}

			s.push(i);

		}

		while (!s.isEmpty()) {
			ans[s.pop()] = -1;
		}
		
		
		System.out.println(Arrays.toString(ans));

	}

}
