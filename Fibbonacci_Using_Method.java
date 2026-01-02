package assignment;

public class Pro12_Fibbonacci_Using_Method {
	/**Question 1: Fibonacci Series Using Method
	Problem Statement:
	Write a Java program to print the first n numbers of the Fibonacci series.
	Rules:
	•	Use a method printFibonacci(int n)
	•	Use loops only (no recursion)
	•	Do not use String
	•	Use only int variables
	Example:
	Input: n = 7
	Output:
	0 1 1 2 3 5 8
 */

	static int  printFibonacci(int n)
	{
		int num=0;int num1=1;
		int result=0;
		System.out.print(num+" "+num1+" ");
		for(int i=1;i<=n;i++)
		{
			 result =num+num1;
			 if(result>8)
				 break;
			 System.out.print(" "+result);
			 num=num1;
			 num1=result;
		}
		return result;
		
	
		
	}

	public static void main(String[] args) {
		

		
		int res=Pro12_Fibbonacci_Using_Method.printFibonacci(7);
	    System.out.println();
		System.out.println("Last number of fibonacci:"+res);

	}

}
