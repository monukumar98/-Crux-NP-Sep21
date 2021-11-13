package Lec15;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 7));

	}

	public static int power(int a, int n) {
		if (n == 0) {
			return 1;
		}

		int pn = power(a, n - 1);
		return a * pn;

	}

}
