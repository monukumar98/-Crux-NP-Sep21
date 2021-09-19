package Lec2;

public class Pttern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int nst=n;// Number of Star
		int nsp =0;// number of Sapce
		int row=1;
		while(row<=n) {
			// Space 
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
					
			}
			//Star
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			// next row ki Pre
			nst--;
			nsp+=2;// nsp = nsp+2;
			row++;
			System.out.println();
			
			
				
		}
				
		

	}

}
