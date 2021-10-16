package Lec8;

public class Sub_Array_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int [] arr = {-3,4,5,-7,8};
		System.out.println(max_sum(arr));

	}
	public static int max_sum(int [] arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
				
				sum+=arr[j];
				ans = Math.max(ans, sum);
			}
			
		}
		return ans;
	}

}
