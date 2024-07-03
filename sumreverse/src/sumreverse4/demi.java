package sumreverse4;

public class demi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=766;
		int copy=no;
		int reverse=0;
		while(no!=0)
		{
			int rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
		}
		System.out.println(reverse);
		if(copy==reverse)
		{
			System.out.println("the given number is palindrome");
		}
		else {
			System.out.println("the given number is not palindrome");
		}

	}

}
