package Lec6;

public class Linear_Serach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 40, 50, 9, 90, 80, 4 };
		System.out.println(Search(arr, 19));

	}

	public static int Search(int[] arr, int item) {
		// TODO Auto-generated method stub
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i]==item) {
        		return i;
        	}
			
		}
        return -1;
	}

}
