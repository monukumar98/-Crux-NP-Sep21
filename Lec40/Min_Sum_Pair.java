package Lec40;

import java.util.PriorityQueue;

public class Min_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 3, 2 };
		System.out.println(miniSumpair(arr));

	}

	public static int miniSumpair(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
		// PriorityQueue<Integer> maxheap = new
		// PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);

		}
		int sum=0;
		while(pq.size()>1) {
			int a=pq.remove();
			int b=pq.remove();
			sum=sum+(a+b);
			pq.add(a+b);
		}
		return sum;

	}

}
