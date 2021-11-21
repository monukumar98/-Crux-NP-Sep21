package Lec18;

public class key_Paid {
	static String[] key = {"","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "198";
		Key_Paid(str, "");

	}
	public static void Key_Paid(String ques, String ans) {//198
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);//1
		String Pressed_Key= key[ch-48];
		for (int i = 0; i < Pressed_Key.length(); i++) {
			Key_Paid(ques.substring(1), ans+Pressed_Key.charAt(i));
			
		}
		
	}

}
