package Lec9;

public class First_Bad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/* The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version); */
	//https://leetcode.com/problems/first-bad-version/

  public int firstBadVersion(int n) {
      int lo=1;
      int hi=n;
      int ans=0;
      while(lo<=hi){
          
          int mid = (lo+hi)/2;
          if(isBadVersion(mid)){
              ans=mid;
              hi=mid-1;
          }
          else{
              lo=mid+1;
          }
          
      }
 
return ans;
	}
}

}
