import java.util.Scanner;

class solution 
{
	void multiplication(int no1,int no2,int no3)
	{
		int res=no1*no2*no3;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		solution s1=new solution();
		System.out.println("enter the values a1,a2,a3");
		int a1=sc1.nextInt();
		int a2=sc1.nextInt();
		int a3=sc1.nextInt();
		s1.multiplication(a1,a2,a3);
	}
}
