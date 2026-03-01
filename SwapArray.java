package assignmentGrowSillIT;

public class SwapArray {

	static void Swap(int arr[])
	{
		int num1=arr[0];
		int temp=num1;
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	

	}

	public static void main(String[] args) {
		int arr[]= {12,45,7,89,233,56};
		Swap(arr);

	}

}
