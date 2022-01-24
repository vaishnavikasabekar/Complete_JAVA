import java.util.*;
class calc
{
	int add(int a,int b);
	{
		return a+b;
	}
	int add(int a,int b, int c);
	{
		return a+b+c;
	}
	
}
class demo1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,r1,r2;

		System.out.pritnln("enter any 3 number:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		calc obj=new demo
		r1=obj.add(a,b);
		r2=obj.add(a,b,c);

		System.out.println("Addition is:"+r1);
		System.out.println("Addition is:"+r2);

	}

}