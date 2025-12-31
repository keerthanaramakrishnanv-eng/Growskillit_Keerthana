package day5;

public class Trailin_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num= 23;
       int temp=num;
       int cnt=0;
       int result=0;
       while (num !=0)
       {
    	   num=num/10;
    	   cnt++;
       }
       if(cnt==1)
       {
    	  result=temp*10; 
       }
       else if(cnt==2)
       {
    	   result=temp*100; 
       }
       else
       {
    	   result=temp;
       }
       System.out.println(result);
	}

}
