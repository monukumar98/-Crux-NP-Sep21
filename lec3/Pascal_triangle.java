package lec3;


public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int nst =1;
		int row=0;
		while(row<n) {
			// star
			int r=0;
			int val=1;
			while(r<nst) {
				System.out.print(val+" ");
				val =((row-r)*(val))/(r+1);
				r++;
			}
			nst++;
			System.out.println();
			row++;
			
			
		}

	}

}
