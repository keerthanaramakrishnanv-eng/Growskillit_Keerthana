package assignmentGrowSillIT;

public class ReverseArray {
	static void Reverse(int arr[])
	{

		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	
		
	}
	public static void main(String[] args) {
		int arr[]= {10,45,7,899,233,56};
		Reverse(arr);
	}

}
