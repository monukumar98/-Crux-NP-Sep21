package Lec18;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		Toh(n,"Src", "Hlp","Dis");

	}

	public static void Toh(int n, String src, String hel, String dis) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		
		Toh(n-1, src,  dis,hel);
		System.out.println(n+"th Disk Move from "+ src +" to "+dis);
		Toh(n-1, hel, src, dis);
		
		
		
		
	}

}
