package Lec12;

public class Demo_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str1="hello";
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(str);
		System.out.println(str.length());
	
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			
		}

	}

}
