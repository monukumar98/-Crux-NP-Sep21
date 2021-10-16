package Lec8;

public class SubArray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-3,4,5,-7,8};
		System.out.println(max_sum(arr));

	}
	public static int max_sum(int [] arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum=0;
				for (int k = i;  k<=j; k++) {
					sum+=arr[k];
				}
				ans=Math.max(sum, ans);
			}
		}
		return ans;
	}

}
