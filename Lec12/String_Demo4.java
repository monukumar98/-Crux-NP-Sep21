package Lec12;

public class String_Demo4 {
	public static void main(String[] args) {
		String str = "hellobye";
		System.out.println(str.substring(1, 8));
		System.out.println(str.substring(1, 1));
		str=str.substring(2);
		System.out.println(str);
		System.out.println(str.startsWith("l"));
		System.out.println(str.endsWith("bye"));
	

	}

}
