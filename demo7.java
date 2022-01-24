import java.util.*;
class demo7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e,f;
		System.out.println("enter any 2 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		calc obj=new calc();
		c=obj.sum(a,b);
		d=obj.sub(a,b);
		e=obj.mult(a,b);
		f=obj.div( a,b);
		System.out.println("add is:"+c);
		System.out.println("sub is:"+d);
		System.out.println("mult is:"+e);
		System.out.println("div is:"+f);
	}
}
class calc
{
	int sum(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	int mult(int a,int b)
	{
		return a*b;
	}
	int sum(int a,int b)
	{
		return a/b;
	}
}