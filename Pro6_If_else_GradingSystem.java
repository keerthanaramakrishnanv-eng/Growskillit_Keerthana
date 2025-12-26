

public class Pro6_If_else_GradingSystem {

	public static void main(String[] args) 
	{
		/*Question 3: Grading System
            Write a Java program that:
           Takes an integer marks value (0â€“100)Prints the grade based on the following conditions:
            Marks Range	Grade
            90 â€“ 100	A
            75 â€“ 89		B
            50 â€“ 74		C
            Below 50	Fail*/
		int mark =30;
		if(mark >0)
		{
			if((mark>=90)&&(mark<=100)&&(mark>=50))
			{
				System.out.println("Grade: A" );
			}
			else if((mark>=75)&&(mark<=89)&& (mark>=50))
			{
				System.out.println("Grade: B" );
			}
			else if((mark>=50)&&(mark<=74)&& (mark>=50))
			{
				System.out.println("Grade: C" );
			}
			else
			{
				System.out.println("fail" );
			}
		}
		else
		{
			System.out.println("invalide number");
	
		}
	}

}
