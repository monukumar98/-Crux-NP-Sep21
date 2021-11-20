package Lec17;

public class Climbing_Stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		//print_path(0, n, "");
		System.out.println(Count_path(0, n, ""));
		
	}

	public static void print_path(int curr, int end, String ans) {

		if (curr == end) {
			System.out.println(ans);
			return;
		}

		if (curr > end) {
			return;
		}
		for (int step = 1; step <=3; step++) {
			print_path(curr+step, end, ans+step);
			
		}
//		print_path(curr + 1, end, ans + 1);
//		print_path(curr + 2, end, ans + 2);
//		print_path(curr + 3, end, ans + 3);

	}

	
	
	public static  int  Count_path(int curr, int end, String ans) {

		if (curr == end) {
			
			return 1;
		}

		if (curr > end) {
			return 0;
		}
		int count=0;
		for (int step = 1; step <=3; step++) {
			
			count+=Count_path(curr+step, end, ans+step);
			
		}
		return count;
		


	}
}
