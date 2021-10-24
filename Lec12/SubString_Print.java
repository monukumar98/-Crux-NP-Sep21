package Lec12;

public class SubString_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		Print(str);

	}
	public static void Print(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <=str.length(); j++) {
				String s=str.substring(i,j);
				if(Is_pali(s)) {
				System.out.println(s);
				}
				
			}
			
		}
	}
	public static boolean Is_pali(String s) {
		// TODO Auto-generated method stub
		int i =0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		
		return true;
	}

}
