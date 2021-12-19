package Lec22;

public class MegertwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 5, 9, 11, 13 };
		int[] arr2 = { 1, 2, 4, 6, 7 };
		int[] arr = mergetwosortedarray(arr1, arr2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

	public static int[] mergetwosortedarray(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (j == arr2.length) {
			while (i < arr1.length) {
				ans[k] = arr1[i];
				i++;
				k++;
			}
		}
		if (i == arr1.length) {
			while (j < arr2.length) {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		return ans;

	}

}
