package Lec7;

public class Product_of_Array_Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3,4,5,6,1};
		arr = Array_Except_Opt(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
	public static int [] Array_Except(int [] arr) {
		
		int n = arr.length;
		int [] left = new int [n];//left array 
		left[0]=1;
		for (int i = 1; i < left.length; i++) {
			left[i]=left[i-1]*arr[i-1];
			
		}
		int [] right = new int [n];
		right[n-1]=1;
		for (int i = n-2; i>=0; i--) {
			right[i]=right[i+1]*arr[i+1];
			
		}
		for (int i = 0; i < right.length; i++) {
			left[i]=left[i]*right[i];
		}
		return left;
	}

	

public static int [] Array_Except_Opt(int [] arr) {
	
	int n = arr.length;
	int [] left = new int [n];//left array 
	left[0]=1;
	for (int i = 1; i < left.length; i++) {
		left[i]=left[i-1]*arr[i-1];
		
	}
	int r=1;
	for (int i = n-1; i>=0; i--) {
		left[i]=left[i]*r;
		r= r*arr[i];
		
	}
	
	return left;
}

	
}
