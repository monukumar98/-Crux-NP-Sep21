package Lec13;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] brr = new int[m];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = sc.nextInt();
		}
		SumOfTwoArrays(arr, brr);
	}

	public static void SumOfTwoArrays(int[] arr, int[] brr) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = arr.length - 1;
		int j = brr.length - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = 0;
			if (i >= 0) {
				sum += arr[i];
				i--;
			}
			if (j >= 0) {
				sum += brr[j];
				j--;
			}
			sum += carry;
			list.add(0, sum % 10);
			carry = sum / 10;

		}
		if(carry==1) {
			list.add(0, 1);
		}
		
		for (int k = 0; k <list.size(); k++) {
			System.out.print(list.get(k)+", ");
			
		}
		System.out.println("END");

	}

}
