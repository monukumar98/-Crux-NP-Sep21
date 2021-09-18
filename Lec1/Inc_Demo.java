package Lec1;


public class Inc_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
//		int b= a++;//a=a+1
//		System.out.println(b);
		System.out.println(a++);
		System.out.println(a);
		
		
		int b=9;
		int c = ++b;//b=b+1
		System.out.println(c);
		System.out.println(b);
		System.out.println(++c);
		  a=3;
		  b=5;
		int d = a++ + ++b;
		System.out.println(d);
		
		int x =9;
		x%=3;
		System.out.println(x);
		

	}

}
