package Lec14;

public class next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 6, 2, 4, 7, 6, 4 };
		nextPermutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		

	}

	public static void nextPermutation(int[] arr) {

		int p = -1;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}

		}
		if(p==-1) {
			Reverse(arr, 0, arr.length-1);
			return;
		}
		int q = -1;
		for (int i = arr.length - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		// swap
		int t = arr[p];
		arr[p] = arr[q];
		arr[q] = t;
		Reverse(arr, p+1, arr.length-1);

	}

	public static void Reverse(int[] arr, int i, int j) {

		while (i < j) {

			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}

}
