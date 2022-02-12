package Lec38;

public class Unique_number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 7, 3, 5, 2, 8, 9, 9, 8 };
		System.out.println(singleNumber(arr));

	}

	public static int singleNumber(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}

		return ans;
	}

}
