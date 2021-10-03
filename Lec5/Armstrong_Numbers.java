package Lec5;

import java.util.Scanner;

public class Armstrong_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		printArmstrongNumbers(n1, n2);

	}

	public static void printArmstrongNumbers(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			if (Armstromg(i)) {
				System.out.println(i);
			}

		}
	}

	public static boolean Armstromg(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		int c = countofdigit(n);
		int i = n;
		while (n != 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, c));
			n /= 10;
		}

		if (sum == i) {
			return true;
		}
		return false;
	}

	public static int countofdigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;

	}

}
