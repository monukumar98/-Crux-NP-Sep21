package Lec2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		int n=5;
		int nsp =0;
		int nst =n;
		int row=1;
		while(row<=n) {
			//Space
			int csp =1;//Count of Space
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			//Star
			
			int cst =1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;// cst = cst+1;
			}
			
			// next row Pre
			nst--;
			nsp++;
			row++;
			System.out.println();
			
		}


	}

}
