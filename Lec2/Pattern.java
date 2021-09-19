package Lec2;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row =1;
		int nst = 1;// number of star
		
		while(row<=n) {
			// star 
			int cst =1;
			while(cst<=nst) {
				System.out.print("*"+" ");
				cst++;
				
			}
			// next row Pre
			row++;
			System.out.println();
			nst++;
		}

	}

}
