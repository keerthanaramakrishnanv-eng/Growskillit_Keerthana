package assignmentGrowSillIT;

public class ReplaceNumberatOddPositionwith {
	/**Input: 48291
	Positions (from right): 1 2 3 4 5
	Digits:                1 9 2 8 4
	Output: 08090
*/
	static int ReplaceZero(int num) {
		int position=1;
	      int cnt=1;
	      int reverse=0;
		      while(num!=0)
		      {
		    	  int result=num%10;

		    	 if(cnt%2==1) 
		    	 {
		    		 result=0;
		    	 }
		         reverse=reverse+result*position;
		    	 position=position*10;	    	
		    	 num/=10;
		    	 cnt++;
			
		      }
		      return reverse;
	}

	public static void main(String[] args) {

          int reverse =ReplaceZero(48291);
    	  System.out.println(reverse);
	}
}
