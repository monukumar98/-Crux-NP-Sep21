package Lec15;

public class All_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 7, 2, 7, 3, 2, 7, 2, 3 };
		//AllOcc(arr, 0, 7);
		int [] ans = AllOcc1(arr, 0, 7, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		

	}

	public static void AllOcc(int[] arr, int i, int item) {
		if (i == arr.length) {
			return;
		}
		if (arr[i] == item) {
			System.out.println(i);
		}

		AllOcc(arr, i + 1, item);

	}

	public static int[] AllOcc1(int[] arr, int i, int item, int count) {
        if(i==arr.length) {
        	int [] bs = new int [count];
        	return bs;
        }
		if (arr[i] == item) {
			
			int [] ans = AllOcc1(arr, i+1, item, count+1);
			ans[count]=i;
			return ans;
		}
		
		else {
		return	AllOcc1(arr, i+1, item, count);
		}
		

	}

}
