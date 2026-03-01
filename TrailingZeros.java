package assignmentGrowSillIT;

public class TrailingZeros {
	static int Tzero(int inputNum) {
		int origNum=inputNum;
		int cnt=0;
		int result=0;
		while(inputNum!=0)
		{					
			inputNum/=10;			
			cnt++;
		}
		if(cnt==1)
		{
			result=origNum*10;
		}
		else if(cnt==2)
		{
			result=origNum*100;
		}
		else
		{
			result=origNum;
		}
		return result;
	}

	public static void main(String[] args) {
	
		
	    int result =Tzero(700);	
		System.out.println(result);
	}

}
