package Lec27;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// P obj = new P();
//		C obj = new C();
//		obj.
		// Case 1
		P obj = new P();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		obj.fun();
		obj.fun1();

		System.out.println("**************");
		// Case 2
		P obj1 = new C();
		System.out.println(obj1.d);// 10
		System.out.println(obj1.d1);// 100
		System.out.println(((C) (obj1)).d);// 20
		System.out.println(((C) (obj1)).d2);// 200
		System.out.println(((C) (obj1)).d1);// 100
		System.out.println(obj1.d);// 10

		obj1.fun();
		((C) (obj1)).fun2();
		obj1.fun1();

		// Case 3
//		C obj2 = new P();
//		System.out.println(obj2.d);// c ka
//		System.out.println(obj2.d1);// p
//		System.out.println(obj2.d2);//c
//		System.out.println(((P)(obj2)).d);
		System.out.println("***********");
		// Case 4
		C obj3 = new C();
		System.out.println(obj3.d);
		System.out.println(obj3.d1);
		System.out.println(obj3.d2);
		System.out.println(((P) (obj3)).d);
		obj3.fun();
		obj3.fun1();
		obj3.fun2();
		((P) (obj3)).fun();

	}

}
