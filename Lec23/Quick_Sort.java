package Lec23;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 2, 4, 1, 9, 11, 3 };
		QuickSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	public static  void QuickSort(int []arr,int si,int ei) {
		
		if(si>ei) {
			return;
		}
		int pi =pivot_Index(arr, si, ei);
		QuickSort(arr, si, pi-1);
		QuickSort(arr, pi+1, ei);
		
		
		
	}

	public static int pivot_Index(int[] arr, int si, int ei) {
		int pivot = arr[ei];
		int pi = si;// pivot ka index
		for (int i = si; i <= ei - 1; i++) {
			if (arr[i] <= pivot) {
				int t = arr[pi];
				arr[pi] = arr[i];
				arr[i] = t;
				pi++;

			}

		}
		int t = arr[pi];
		arr[pi] = arr[ei];
		arr[ei] = t;
		return pi;

	}
}
