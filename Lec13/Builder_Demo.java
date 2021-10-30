package Lec13;

public class Builder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("hellobye");
		sb.append("hellobyehey");
		sb.append("hellobyeheyhellobye");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.reverse());
		// Builder to String

		String s = sb.toString();
		// String to Builder
		
		String s1 = "bye";
		StringBuilder sb1 = new StringBuilder(s1);

	}

}
