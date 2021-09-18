package Lec1;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9;
		int fact=0;
		int i=2;
		while(i<n) {
			if(n%i==0) {
				fact++;
				break;
			}
			
			i++;
		}
      if(fact==0) {
    	  System.out.println("Prime");
      }
      else {
    	  System.out.println("Not Prime");
      }
		
		
	}

}
