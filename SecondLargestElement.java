package assignmentGrowSillIT;


public class SecondLargestElement 
{
	static int secLargest(int arr[])
	{
		int maxi=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(maxi<arr[i])
			{
				maxi=arr[i];			
			}
		}	
		int maxi1=arr[0];
		int maxi2=maxi;
		for(int i=1;i<arr.length;i++)
		{
			if(maxi1<arr[i] && maxi2>arr[i])
			{
				maxi1=arr[i];
				
			}
		}
	
		return maxi2;
	}

	public static void main(String[] args)
	{
         int arr[]={12,45,70,89,23,56};
		 int maxi=secLargest(arr);
		 System.out.println(maxi);
		
	}

}
