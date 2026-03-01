package assignmentGrowSillIT;

public class sumofalldigits {
	
	static void sumDigits() 
	{
		int num=569;
		int finalResult=0;
		while(num!=0)
		{
			int result=num%10;
			finalResult =finalResult+result;
			num/=10;
		}
		System.out.println(finalResult);
	}

	public static void main(String[] args) 
	{
		sumDigits();
	}

}
