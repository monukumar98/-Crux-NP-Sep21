package Lec13;

public class Interger_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = 100;
		System.out.println(i);
		int a = 10;
		System.out.println(a);
		i = a;// AutoBoxing
		a = i;// un_boxing

		Integer a1 = 27;
		Integer a2 = 27;

		System.out.println(a1 == a2);

		Integer b1 = 147;
		Integer b2 = 147;
		System.out.println(b1 == b2);

	}

}
