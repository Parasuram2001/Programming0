package sumcheck;

public class demo22 {

	static int reverse(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem;
			no=no/10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=444;
		while(no>9)
		{
			no=reverse(no);
		}
		if(no==1||no==7)
		{
			System.out.println("it is a happy number");
		}
		else {
			System.out.println("it is not a happy number");
		}
		

	}

}
