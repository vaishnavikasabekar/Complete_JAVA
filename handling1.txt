import  java.util.*;
class abc5
{
	public static void main(String[] args)
	try
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter any 2 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("division is:"+c);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
		System.out.println("b is not be 0");
	}
	finally
	{
		System.out.println("bye");
	}
}