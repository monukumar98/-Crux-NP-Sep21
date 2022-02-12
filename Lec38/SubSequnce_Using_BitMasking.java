package Lec38;

public class SubSequnce_Using_BitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		printsubsequnce(str);

	}

	public static void printsubsequnce(String str) {

		int n = str.length();
		for (int i = 0; i < (1 << n); i++) {// (1<<n= 2^n)

			pattern(str, i);
		}

	}

	private static void pattern(String str, int k) {
		// TODO Auto-generated method stub
		int pos=0;
		while(k!=0) {
			if((k&1)!=0) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			k>>=1;
		}
		System.out.println();
		
	}

}
