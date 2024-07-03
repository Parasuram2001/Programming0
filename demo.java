interface tester
{
	void cool();
	void fo();
}
abstract class sample implements tester
{
	public void cool()
	{
		System.out.println("hi");
	}
	//public abstract void fo();
}
class demo extends sample
{
	/*public void cool()
	{
		System.out.println("hi");
	}
	*/
	public void fo()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) 
	{
		demo d1=new demo();
		d1.cool();
		d1.fo();
	}
}
