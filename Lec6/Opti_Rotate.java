package Lec6;

public class Opti_Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
				int k = 3;
				rotate(arr, k);
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+" ");
				}

	}
   public static void rotate(int []arr,int k) {
	   int n = arr.length;
	   k=k%n;
	   reverse(arr, 0, n-k-1);
	   reverse(arr, n-k, n-1);
	   reverse(arr, 0, n-1);
	   
	   
	   
	   
	   
	   
   }
	
	
	
	public static void reverse(int[] arr, int i, int j) {

		while (i < j) {
			// Swaping
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;

			i++;
			j--;

		}

	}

}
