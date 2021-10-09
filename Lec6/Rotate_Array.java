package Lec6;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotatearray(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void rotatearray(int [] arr, int k) {
		k=k%arr.length;// Repit kr raha tha
		for (int r = 1; r <=k; r++) {
			
		
		int last=arr[arr.length-1];
		for (int i = arr.length-1; i>0; i--) {
			arr[i]=arr[i-1];
			
		}
		arr[0]=last;
		}
			
	}

}
