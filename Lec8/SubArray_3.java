package Lec8;


public class SubArray_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-3,-4,-5,-7,-8};
		System.out.println(Kadenes(arr));

	}
	public static int Kadenes(int [] arr) {
		int ans = Integer.MIN_VALUE;
		int curr_sum=0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum+=arr[i];
			ans = Math.max(ans, curr_sum);
			if(curr_sum<0) {
				curr_sum=0;
			}
			
			
			
		}
		return ans;
		
		
	}
}