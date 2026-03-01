package assignmentGrowSillIT;

public class SumArray {
	
	static int Sum(int arr[])
	{
		int result=0;
		for(int i=0;i<arr.length;i++)
		{
			result=result+arr[i];
		}
		return result;
		
	}

	public static void main(String[] args) 
	{
        int arr[]= {10,45,7,899,233,56};
        int sumTotal=Sum(arr);
        System.out.println(sumTotal);
	}

}
