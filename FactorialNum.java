package assignment;

public class Pro9_FactorialNum {

	public static void main(String[] args) {
		// Write a Java program to find the factorial of a given number using a loop.
		//Example: 6 â†’ 720
		//6*5*4*3*2*1
	   int result=1;
		for(int i=1;i<=6;i++) 
		{
			result=result*i;
		}
		System.out.println(result);
	}

}
