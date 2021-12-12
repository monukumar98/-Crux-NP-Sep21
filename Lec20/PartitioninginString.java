package Lec20;

public class PartitioninginString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		Partitioning(str, "");

	}
	
	
	public static void PalindromePartitioning(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {

			PalindromePartitioning(ques.substring(i), ans + ques.substring(0, i) + "|");

		}

	}

	public static void Partitioning(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {

			Partitioning(ques.substring(i), ans + ques.substring(0, i) + "|");

		}

	}
	

	

}
