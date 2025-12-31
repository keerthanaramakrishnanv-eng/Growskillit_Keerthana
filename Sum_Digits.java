package day5;

public class Sum_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=546;
		int result=0;
		while(num!=0)
		{
			int rev =num%10;
			result=result+rev;
			num/=10;
		}
		System.out.println(result);

	}

}
