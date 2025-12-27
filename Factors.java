package assignment;

public class Pro11_Factors {

	public static void main(String[] args) {
		// print factors of a number
		//input: 12
		//output 1 2 3 4 6 12

		int num=12;
		for(int i=1;i<=12;i++)
		{
			if(num%i==0)
			{
			System.out.print(i+" ");
			}
		}

	}

}
