package assignmentGrowSillIT;

public class SumofEvenNumbers {

	static int SumofEven(int arr[])
	{
		int result=0;
		for(int i=0;i<arr.length;i+=2)
		{
			result=result+arr[i];
		}
		return result;
		
	}

	public static void main(String[] args) 
	{
        int arr[]= {2, 5, 8, 11, 14};
        int sumTotal=SumofEven(arr);
        System.out.println(sumTotal);
	}
}
