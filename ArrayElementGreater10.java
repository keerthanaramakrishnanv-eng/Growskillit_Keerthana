package assignmentGrowSillIT;

public class ArrayElementGreater10 {
	static int ElementGreater10(int arr[],int num) 
	{
        int cnt=0;
		for(int i=1;i<arr.length;i++)
		{
			if(num<arr[i])
			{
				cnt++;
	
			}	
		}
		return cnt;
	}
	public static void main(String[] args) 
	{
	int arr[]={4, 12, 9, 20, 7, 15};
	int cnt=ElementGreater10(arr, 10);
	 System.out.println(cnt);
	}
}
