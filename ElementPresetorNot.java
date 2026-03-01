package assignmentGrowSillIT;

public class ElementPresetorNot {

	static boolean YesorNo(int arr[])
	{
	
         boolean isTrue=false;
		for(int i=0;i<arr.length;i++)
		{

			if(arr[i]==21)
			{
				isTrue=true;
			}	
			
		}
		return isTrue;

	}
	public static void main(String[] args) {
		int arr[]= {7, 22, 21, 28};
		boolean isTrue=YesorNo(arr);
		if(isTrue==true)
		{
           System.out.println("Present");
		}
		else
		{
			System.out.println("Not Preesent");
		}
	}

}
