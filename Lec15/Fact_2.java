package Lec15;

public class Fact_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fact_tail(5, 1));

	}

	public static int Fact_tail(int n, int ans) {
		if (n == 0 || n == 1) {
			return ans;
		}

		return Fact_tail(n - 1, ans * n);
	}

}
