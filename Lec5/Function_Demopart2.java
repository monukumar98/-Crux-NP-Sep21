package Lec5;

public class Function_Demopart2 {
     static int val=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=7;
	
		System.out.println(a+" "+b);
		swap(a, b);
		System.out.println(a+" "+b);
		  System.out.println(val);

	}

	public static void swap(int a, int b) {
		int val =9;
        System.out.println(Function_Demopart2.val);
		int t = a;
		a = b;
		b = t;
		
	}

}
