package Lec18;

public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counting(0, 1000);
	}

	public static void Counting(int curr, int end) {
		if (curr > end) {
			return;
		}

		System.out.println(curr);

		int i = 0;

		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			Counting(curr*10+i, end);
		}

	}

}
