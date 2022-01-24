import java.util.*;
class demo
{
	int add(int a,int b)
	{
		return(a+b);
	}
	int sub(int a,int b)
	{
		return(a-b);
	}int mult(int a,int b)
	{
		return(a*b);
	}int div(int a,int b)
	{
		return(a/b);
	}
	
}
class calc4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,r1,r2,r3,r4;
		System.out.println("enter any 2 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		demo.Obj=new demo
		r1=Obj.add(a,b);
		r2=Obj.sub(a,b);
		r3=Obj.mult(a,b);
		r4=Obj.div(a,b);
		System.out.println("addition is:"+r1);
		System.out.println("substraction is:"+r2);
		System.out.println("multiplication is:"+r3);
		System.out.println("division is:"+r4);
		
	}
}