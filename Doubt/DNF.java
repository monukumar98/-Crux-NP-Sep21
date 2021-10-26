package Doubt;

import java.util.Scanner;

public class DNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;//0 ka track
		int j=0;// array pe traverse
		int k= arr.length-1;// 2 ka track
		while(j<=k) {
			if(arr[j]==2) {
				int t = arr[j];
				arr[j]=arr[k];
				arr[k]=t;
				k--;
			}
			else if(arr[j]==0) {
				int t = arr[j];
				arr[j]=arr[i];
				arr[i]=t;
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		

	}

}
