//wap to reverse user given string method with parameter.non static to static.
import java.util.Scanner;
class rev
{
	void reverse(String str)
	{
		String rev=" ";
		for (int i=str.length()-1;i>=0 ;i-- )
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		rev s1=new rev();
		System.out.println("enter the sentences as your wish");
		String a=sc.nextLine();//to access from non -static scanner class to static using reference variable.
		s1.reverse(a);
	}
}
