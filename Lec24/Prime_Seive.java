package Lec24;

public class Prime_Seive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isprime(100);

	}

	public static void isprime(int n) {

		boolean[] prime = new boolean[n + 1];
		prime[0] = true;// true means not prime and false is prime
		prime[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == false) {
				for (int mul = 2; mul * i <= n; mul++) {
					prime[mul * i] = true;

				}

			}

		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.print(i + " ");
			}
		}

	}

}
