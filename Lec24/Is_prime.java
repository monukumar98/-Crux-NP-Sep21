package Lec24;

public class Is_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public static boolean isprime(int n) {

		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;

		}
		return true;
	}
	
	

}
