class demo8
{
	public static void main(String[] args)
	{
		try
		{
			int a,b,c;
			a=Integer.parseInt(args [0]);
			b=Integer.parseInt(args [1]);
			c=a/b;
			System.out.println("division is:"+c);

		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("provide 2 array");

		}
		catch(ArithmeticException ae)
		{
			System.out.println("b cam not be 0");

		}
		catch(Exception ex)
		{
			System.out.println("ex");

		}
	       
	}
}