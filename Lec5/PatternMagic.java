package Lec5;

import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = n;
		int nsp = - 1;
		int row = 1;
		while(row<=2*n-1) {
			// star
			int cst =1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			
			// space
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			
			// star
			cst =1;
			if(row==1 || row==2*n-1) {
				cst++;
			}
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			if(row<n) {
				nst--;
				nsp+=2;
			}
			else {
				nst++;
				nsp-=2;
			}
			row++;
			System.out.println();
			
		}

	}

}
