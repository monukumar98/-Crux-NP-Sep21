package Lec24;

public class PowerinLongN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2, 8));

	}

	public static int pow(int a, int n) {
		if(n==0) {
			return 1;
		}

		int ans = pow(a, n / 2);
		if (n % 2 == 0) {
			return ans * ans;
		} else {
			return ans * ans * a;
		}

	}

}
