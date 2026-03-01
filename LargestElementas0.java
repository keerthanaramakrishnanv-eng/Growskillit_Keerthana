package assignmentGrowSillIT;

public class LargestElementas0 {
	static void fun(int arr[]) 
	{
		int maxi=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(maxi<arr[i])
			{
				maxi=arr[i];
	
			}	
		}
		for(int i=1;i<arr.length;i++)
		{
			if(maxi==arr[i])
			{
				arr[i]=0;
	
			}	
			System.out.print(arr[i]+" ");
		}
		
	
	}
	public static void main(String[] args) {
		int arr[]= {12,45,7,899,233,56};
		fun(arr);

	}

}
