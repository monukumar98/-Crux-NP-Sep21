package Lec5;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int val=1;
		while (row <= 2 * n - 1) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst=1;
			int v=val;
			while(cst<=nst) {
				System.out.print(v+" ");
				if(cst<=nst/2) {
					v++;
				}
				else {
					v--;
				}
				
				cst++;
				
			}
			if(row<n) {
				nsp--;
				nst+=2;
				val++;
			}
			else {
				nsp++;
			    nst-=2;
			    val--;
			}
			System.out.println();
			row++;
		}

	}

}
