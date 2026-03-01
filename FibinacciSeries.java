package assignmentGrowSillIT;

public class FibinacciSeries {
	
	//0 1 1 2 3
	static void printFibonacci(int num)
	{
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		for(int i=1;i<=num;i++) {
			int result=num1+num2;
			num1=num2;
			num2=result;
			if (result>8)
				break;
			System.out.print(result+" ");
	
		}
	}

	public static void main(String[] args)
	{
		printFibonacci(7);

	}

}
