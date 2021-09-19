package Lec2;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nst=1;
		int nsp=n-1;
		int row=1;
		
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int val=1;
			int cst=1;
			while(cst<=nst) {
				System.out.print(val+" ");
				cst++;
				val++;
			}
			nst+=2;
			nsp--;
			row++;
			System.out.println();
			
		}


	}

}
