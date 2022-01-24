class StringChar
{
	public static void main(String []args)
	{
		for(int index=0;index<args.length;index++)
		{
			String p=args[index];
			for(int index1=0;index1<p.length();index1++)
			{
				char ch=p.charAt(index1);
				System.out.println(ch);
			}
		}
	}
}