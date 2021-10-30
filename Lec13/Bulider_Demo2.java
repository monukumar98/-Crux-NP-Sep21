package Lec13;

public class Bulider_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("hello");
		System.out.println(s.capacity());
	//	Bulider_Demo();
		String_Demo();

	}

	public static void Bulider_Demo() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 100000; i++) {

			s.append(i);
		}
		System.out.println(s);
	}

	public static void String_Demo() {
		String s = "";
		for (int i = 0; i < 100000; i++) {

			s= s + i;
		}
		System.out.println(s);
	}

}
