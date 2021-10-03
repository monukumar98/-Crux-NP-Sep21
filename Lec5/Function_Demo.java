package Lec5;

public class Function_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
//		addtion();// function calling
//		// int c = addtionret();
//		System.out.println(addtionret());
	    int a=5;
	    int b=7;
        addtionpara(a, b);
        System.out.println(addtionpararet(9, 11));
		System.out.println("bye");

	}

	public static void addtion() {
		int a = 9;
		int b = 7;
		int c = a + b;
		System.out.println(c);

	}

	public static int addtionret() {
		int a = 9;
		int b = 7;
		int c = a + b;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	
			return c;
		
	}
	public static void addtionpara(int a, int b) {
		int c = a+b;
		System.out.println(c);
	
	}
	public static int addtionpararet(int a, int b) {
		int c = a+b;
		return c;
	
	}

}
