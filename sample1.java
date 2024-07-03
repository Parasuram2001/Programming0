class sample1 
{
	public static void main(String[] args) 
	{
		String[] str={"gadag","hubli","kanak","malayalam","dharwad"};
		String reverse=" ";
		for (int i=str.length()-1;i>=0 ;i-- )
		{
			reverse=reverse+str.charAt(i);
			if (str.equals(reverse))
			{
				System.out.println(str);
			}
			/*else
			{
				System.out.println("Strings are not palindrome");
			}*/
		}
	}
}
