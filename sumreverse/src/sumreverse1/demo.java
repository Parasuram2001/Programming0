package sumreverse1;

public class demo {
	static void reverse(int no)
	{
		
		int reverse=0;
		while(no!=0)
		{
			int rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
		}
		System.out.print(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=789065;
		reverse(no);
		

	}

}
