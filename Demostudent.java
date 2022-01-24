class parent
{
	private int x;
	
	void input()
	{
		x=10;
	}
	void show()
	{
		System.out.println(x);
	}
}
class child extends parent
{
	private int y;
	
	void input()
	{
		super.input();
		y=20;
	}
	void show()
	{
		super.show();
		System.out.println(y);
	}
}
class DemoStudent
{
	public static void main(String[] args)
	{
		child c=new child();
		c.input();
		c.show();
		
	}
}