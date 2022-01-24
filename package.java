import java.util.*;
class package
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e,f;
		System.out.println("enter any 2 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		calc obj=new calc(a,b);
		c=obj.add();
		d=obj.sub();
		e=obj.mult();
		f=obj.div();
		System.out.println("addition is:"+c);
		System.out.println("substraction is:"+d);
		System.out.println("multiplication is:"+e);
		System.out.println("division is:"+f);
	}
}
class calc
{
	int a,b;
	calc()
	{
		a=0;
		b=0;
	}
	calc(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int add()
	{
		return a+b;
	}
	int sub()
	{
		return a-b;
	}
	int mult()
	{
		return a*b;
	}
	int div()
	{
		return a/b;
	}
}