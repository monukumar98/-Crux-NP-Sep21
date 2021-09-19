package Lec2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst = n;
		
		int row=1;
		while(row<=n) {
			//Star
			int cst =1;
			while(cst<=nst) {
				System.out.print("*"+" ");
				cst++;// cst = cst+1;
			}
			nst--;
			row++;
			System.out.println();
		}
		

	}

}
