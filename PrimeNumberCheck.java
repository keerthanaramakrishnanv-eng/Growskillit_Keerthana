package assignmentGrowSillIT;

public class PrimeNumberCheck {
	
	static void isPrime(int num)
	{
		
		if(num==1)
		{
			System.out.println("neither prime nor constant");
		}
		else if(num==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			boolean flag=false;
			for(int i=3;i<num;i+=2)
			{
				if(num%i==0)
				{
					flag=true;	
				}					
			}
			if (flag==true) 
			{
				System.out.println("Not a Prime Number");
			}
			else
			{
				System.out.println("Prime Number");
			}
		}
 
	}

	public static void main(String[] args) 
	{
		
		isPrime(113);
		
	}

}
