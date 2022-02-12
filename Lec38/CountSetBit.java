package Lec38;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 83;
		System.out.println(CountSetbit(n));

	}

	public static int CountSetbit(int n) {
		int count = 0;

		while (n != 0) {

			if ((n & 1) == 1) {
				count++;
			}
			n >>= 1;// n= n>>1;
		}
		return count;

	}

	public static int CountSetbitFast(int n) {
		int count = 0;

		while (n != 0) {

			count++;
			n = (n & (n - 1));
		}
		return count;

	}

}
