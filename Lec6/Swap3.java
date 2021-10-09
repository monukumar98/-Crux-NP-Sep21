package Lec6;

public class Swap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] other = { 100, 200, 300, 400 };
		System.out.println(arr[0] + " " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + " " + other[0]);

	}

	public static void Swap_vale(int[] arr, int[] other, int i) {
		// TODO Auto-generated method stub
		int t = arr[i];
		arr[i] = other[i];
		other[i] = t;

	}

	public static void Swap(int[] arr, int[] other) {
		// TODO Auto-generated method stub
		int[] t = arr;
		arr = other;
		other = t;

	}

}
