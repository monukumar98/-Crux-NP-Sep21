package Lec9;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,7,8,9,11,15,18};
		System.out.println(search(arr, 6));

	}
	public static int search(int []arr,int item) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
		
	}

}
