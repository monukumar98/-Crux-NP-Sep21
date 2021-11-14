package Lec16;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		Subseq(str, "");
		

	}

	public static void Subseq(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		Subseq(ques.substring(1), ans);
		Subseq(ques.substring(1), ans + ch);

	}

}
