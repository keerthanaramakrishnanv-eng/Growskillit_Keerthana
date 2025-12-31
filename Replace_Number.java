package day5;

public class Replace_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5678;
	       int cnt=0;
	       int result=0;
	       while (num !=0)
	       {
	    	   int revnum=num%10;
	    	   cnt++;
	    	   num/=10;
	    	   if(cnt==2)
	           {
	        	  result=revnum*10+result; 
	           }
	           else if(cnt==4)
	           {
	        	   result=revnum*1000+result; 
	           }
	          
	        
	       }
	       System.out.println(result);

	}

}
