package Lec15;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}

	public static int fact(int n) {
		
		//base case 
		if(n==0 || n==1) {
			return 1;
		}
		//head

		//int fn = fact(n - 1);// sp
		return n * fact(n-1);// self work

	}

}
