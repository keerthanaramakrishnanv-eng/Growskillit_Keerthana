package assignment;

public class Pro10_EvenOdd {

	public static void main(String[] args) {
		// Write a Java program to count how many even digits and odd digits are present in a given number.
		//Example: 24879
		//Even digits: 3
		//Odd digits: 2
		int num=24879;
		int n=1;int count=0,count1=0;
		while(n<=5)
		{
			int lastnum=num%10;
			
		if(lastnum%2==0)
		{
			count+=1;
		}
		else if(lastnum%2==1)
		{
			count1+=1;
		}
		else
			System.out.println("incorrect number"+" "+num);
		num=num/10;
		n++;
		}
		System.out.println("Even digits:"+count);
		System.out.println("Odd digits:"+count1);
	}

}
