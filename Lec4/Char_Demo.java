package Lec4;

public class Char_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		ch++;// (char) (ch+1);
		ch = (char) (ch + 1);
		System.out.println(ch);
		int i = ch;
		System.out.println((int) (ch));

//		byte b = 19;
//		b++;//(byte) (b+1)
//		b=(byte) (b+1);
//		System.out.println(b);
//		for (byte b = 0; b <128; b++) {
//			System.out.println(b);
//			
//		}

//		for (byte b = 0; b <= 127; b++) {
//			System.out.println(b);
//		}
		
		for (byte b = 0; b <= 126; b++) {
			System.out.println(b);
		}

	}

}
