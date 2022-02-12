package Lec38;

public class Odd_Even {
	public static void main(String[] args) {

		int n = 781;
		if (Odd_even(n)) {
			System.out.println("odd");
		} else {
			System.out.println("Even");
		}

	}

	public static boolean Odd_even(int n) {

		if ((n & 1) > 0) {
			return true;
		} else {
			return false;
		}

	}
}
