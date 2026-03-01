package assignmentGrowSillIT;

public class ArrayEvenOddcnt {

	static void EvenOdd(int arr[])
	{
		int evenCNT=0;
		int oddCNT=0;

		for(int i=0;i<arr.length;i+=2)
		{
			oddCNT++;
		}
		for(int i=0;i<arr.length;i+=1)
		{
			evenCNT++;
		}
		System.out.println("Evencnt:"+evenCNT);
		System.out.println("Oddcnt:"+oddCNT);
	}
	public static void main(String[] args) {
		int arr[]= {10,45,7,899,233,56};
		EvenOdd(arr);
	}


}
