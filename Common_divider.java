package assignment;

public class Pro14_Common_divider 
{
	static int  findGCD(int a, int b)
	{	
		 int gcd=1;
		/** While loop
		 int i=1;
		 while(i<=a)
		 {
			 if(a%i==0 &&b%i==0)
			 {
				 gcd =i;
			 }
			 i++;
		 }
		
		return gcd;	*/
			 for (int i = 1; i <= a && i <= b; i++) 
			 {
		            if (a % i == 0 && b % i == 0) 
		            {
		            	gcd=i;
		            	
		            }
			 }
		return gcd;	
	}
	public static void main(String[] args)
	{
		int result=Pro14_Common_divider.findGCD(5, 50);
		System.out.println(result);
	}

}
