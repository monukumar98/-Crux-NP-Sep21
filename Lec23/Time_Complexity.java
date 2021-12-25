package Lec23;

public class Time_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hllloe");
		System.out.println("hllloe");
		System.out.println("hllloe");
		System.out.println("hllloe");
		System.out.println("hllloe");
		int n = 1000;
		for (int i = 0; i < n; i++) {
			System.out.println("hey");
		}

		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)

			i++;
		}

		while (i < n) {
			System.out.println("Hey");
//O(logN)
			i *= 2;
		}

		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			// O(logN)
		}

		while (i <= n) {
			System.out.println("Hey");
// O(N)
			i += 2;
			i += 3;
		}

		while (i <= n) {
			System.out.println("Hey");

			i *= 2;
			i *= 3;

			// Log(n) base 6
		}
		while (n > 0) {
			System.out.println("Hey");
			// Log(n) base 6

			n /= 2;
			n /= 3;
		}
		while (i <= n) {
			System.out.println("Hey");
         //   O(N/k)
			i += k;
		}
		
		
		while (i <= n) {
			System.out.println("Hey");

			i *= k;
			//O(log(N) base k
		}
		
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 1;
		}
		
		
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 2;
			n = n - 3;
		}
		
		while (n > 0) {
			n = n - k;
			// O(N/K)
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
				// O(N^2)
			}
		}
		
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// O(Sqrt(N))
		}
		
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= 1000; k++) {
// 1000*(N^2)
				}
			}
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}
		
		for( i=1; i<=n; i*=2) {
			System.out.println("hey");
			//O(log(N) base 2
		}
		
		for(i=n/2; i<=n; i++) {
			for(int j=1; j<=n/2; j++) {
				for(int k=1; k<=n; k=k*2) {
					System.out.println("hey");
					// O(N^2Log(N)) 
				}
			}
		}
		
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
			}
		
		}
	}

}
