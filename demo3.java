class calc2
{
	int a,b;
	calc2()
	{
		a=0;
		b=0;

	}
	calc2(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int add()
	{
		return(a+b);

	}
	int sub()
	{
		return(a-b);
	}		
}
class demo
{
	public static void main(String[] args)
	{
		calc2 obj=new calc2(20,10);
		System.out.println("Addition is:"+obj.add());
		System.out.println("Substraction is :"+obj.sub());
		
	}
}