package Lec12;

public class String_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "hello";
		String st2 = "hello";
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1==s2);
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
		System.out.println(s1.equals(s2));
		System.out.println(st1+(10+20)+"bye");


	}

}
