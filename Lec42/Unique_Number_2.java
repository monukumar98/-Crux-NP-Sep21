package Lec42;

public class Unique_Number_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 7, 2, 3, 7, 2, 6 };
		Unique_Number(arr);

	}

	public static void Unique_Number(int[] arr) {
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];
		}
		int mask = (ans & (~(ans - 1)));
		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & mask) > 0) {
				a ^= arr[i];
			}
		}
		int b = ans ^ a;
		System.out.println(Math.min(a, b) + " " + Math.max(a, b));

	}

}
