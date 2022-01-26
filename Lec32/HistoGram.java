package Lec32;

import java.util.Stack;

public class HistoGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(Area(arr));

	}

	public static int Area(int[] arr) {
		int i = 0;
		int maxarea = 0;
		Stack<Integer> st = new Stack<>();
		while (i < arr.length) {
			if (st.isEmpty() || arr[i] > arr[st.peek()]) {
				st.push(i);
				i++;
			} else {
				int h = arr[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					int parea = h * r;
					maxarea = Math.max(parea, maxarea);
				} else {
					int l = st.peek();
					int parea = h * (r - l - 1);
					maxarea = Math.max(parea, maxarea);

				}

			}
		}
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			int r = i;
			if (st.isEmpty()) {
				int parea = h * r;
				maxarea = Math.max(parea, maxarea);
			} else {
				int l = st.peek();
				int parea = h * (r - l - 1);
				maxarea = Math.max(parea, maxarea);

			}
		}
		return maxarea;

	}

}
