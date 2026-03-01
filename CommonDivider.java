package assignmentGrowSillIT;

public class CommonDivider {

	static void findGCD(int a, int b)
	{
		int gcd=1;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				if(i>gcd)
				{
					gcd=i;
				}
			}
		}
		System.out.println("Common Divider="+gcd);
		
		int gcd1=1;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				if(i>gcd1 && i<gcd)
				{	
					gcd1=i;
				
				}
				
			}
		}
		System.out.println("Second Common Divider="+gcd1);
		int gcd2=1;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				if(i>gcd2 && i<gcd1)
				{	
					gcd2=i;
				
				}
				
			}
		}
		System.out.println("third Common Divider="+gcd2);
		
		//LCM
		
		System.out.println("LCM ="+a*b/gcd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findGCD(12,18);
	}

}
