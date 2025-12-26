

public class Pro5_If_Else_GreatestNum {

	public static void main(String[] args)
	{
		/*Question 2: Greatest of Three Numbers

		Write a Java program that:
		Takes three integer numbers
		Finds and prints the greatest number among the three using ifâ€“else
		[considering all 3 numbers are distinct]*/
		
		int a=10,b=30,c=50;
		
		if((a>b)&&(a>c))
		{
			System.out.println(a +" "+"is a Greatest number");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println(b +" "+"is a Greatest number");
		}
		else
		{
			System.out.println(c +" "+"is a Greatest number");
		}
		

	}

}
