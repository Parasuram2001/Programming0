package sumreveverse5;

public class demo {
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
		int no=789;
		while(no>9)
		{
			no=reverse(no);
		}
		System.out.println(no);
		

	}

}
