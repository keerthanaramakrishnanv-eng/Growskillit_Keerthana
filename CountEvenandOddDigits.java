package assignmentGrowSillIT;

public class CountEvenandOddDigits {

	public static void main(String[] args) {

    /**Example: 24879
		Even digits: 3
		Odd digits: 2
		*/
		int num=24879;
		int cnt=0,cnt1=0;
		while (num!=0)
		{
			int result=num%10;
			System.out.println(result);
			if(result%2==0)
			{
				cnt++;
			}
			else
			{
				cnt1++;
			}	
			num/=10;
		}
		System.out.println("Even digits="+cnt);
		System.out.println("Odd digits="+cnt1);

	}

}
