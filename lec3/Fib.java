package lec3;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		int a=0;
		int b =1;
		int i=1;
		System.out.println(a);
		while(i<=n) {
			int c = a+b;
			a=b;
			b=c;
			i++;
			System.out.println(a);
		}
		

	}

}
