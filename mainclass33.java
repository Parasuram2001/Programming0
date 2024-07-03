abstract interface sample1
{
	public abstract void disp();
		public abstract void test();
} 
class demo1 implements sample1
{
	public void disp()
	{
		System.out.println("hello");
	}
	public void test()
	{
		System.out.println("hi");
	}
}
class mainclass33
{
	public static void main(String[] args) 
	{
		demo1 d1=new demo1();
		d1.disp();
		d1.test();
	}
}
