package assignmentGrowSillIT;

public class CountDigits {

	public static void main(String[] args)
	{
		int num=45678 ;
		int cnt=0;
		while(num !=0)
		{
			num/=10;
			cnt++;
		}
		 System.out.print("Sum of Natural Numbers="+cnt);

	}

}
