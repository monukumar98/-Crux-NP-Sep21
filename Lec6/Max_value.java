package Lec6;

public class Max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 40, 50,9,90,80,4 };
		System.out.println(max(arr));
		
		

	}
	public static int max(int []arr) {
		int max=Integer.MIN_VALUE;//-2^31
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		return max;
	}
	

}
