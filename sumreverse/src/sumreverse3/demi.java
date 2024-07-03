package sumreverse3;

public class demi {

	static int reverse()
	{
		int no=345;
		int reverse=0;
		while(no!=0)
		{
			int rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
		}
		return(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(reverse());
		

	}

}
