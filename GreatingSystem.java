package assignmentGrowSillIT;

public class GreatingSystem {

	public static void main(String[] args) {
		/**90 â€“100	A
		75 â€“89		B
		50 â€“74		C
		Below 50	Fail*/
		
		int mark=49;
		if(mark>=90 && mark<=100)
		{
			System.out.println("COngrates!! your Grade A");
		}
		else if(mark>=75 && mark<=89)
		{
			System.out.println("COngrates!! your Grade B");
		}
		else if(mark>=50 && mark<=74)
		{
			System.out.println("COngrates!! your Grade C");
		}
		else
		{
			System.out.println("Sorry,your are Fail");
		}

	}

}
