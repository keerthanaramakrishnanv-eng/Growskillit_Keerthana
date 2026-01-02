package assignment;

public class Pro13_Prime_Number {
	static int  isPrime(int num)
	{
		int result=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
			  result=0;
			  break;
			}
			else 
			  result=1;
			 
		}
		return result;
	}

	public static void main(String[] args) 
	{
		int isPrimeVar=Pro13_Prime_Number.isPrime(111);
		if(isPrimeVar==0)
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
		
			System.out.println("Prime Number");
			
		}

	}

}
