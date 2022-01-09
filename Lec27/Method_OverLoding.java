package Lec27;

public class Method_OverLoding {
	public static void main(String[] args) {
		
		System.out.println(add(2, 5));
		System.out.println(add(3, 9.0));
		System.out.println(add(2,11,-9));
		System.out.println(add(1,2,3,3,4,4,5,15,6,6,6,7,7,8,8,8,1,8,8,11,8,8,8,11,15));
	    int [] arr = {1,2,3,11,4,5,7};
	    System.out.println(add(arr));
		
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a , double b) {
		return (int) (a+b);
	}
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}

	
	public static int add(int ...a) {//varible number Argument 
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
		
	}
	
}
