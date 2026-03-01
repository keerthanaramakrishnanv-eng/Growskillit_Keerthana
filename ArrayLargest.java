package assignmentGrowSillIT;

public class ArrayLargest {
	static int largest(int arr[])
	{
		int maxi=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(maxi<arr[i])
			{
				maxi=arr[i];
			}
		}
		
		return maxi;
		
	}

	public static void main(String[] args) {
		int arr[]= {12,45,7,89,233,56};
		int maxi=largest(arr);
		System.out.println(maxi);

	}

}
