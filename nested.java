class outer
{
	int x=10;
	void outershow()
	{
		System.out.println(x);
		Inner In=new Inner();
		In. Innershow();
	}
	class Inner
	{
		int y=20;
		void Innershow()
		{
			System.out.println(y);
		
		}
	}
}
class nested
{
	public static void main(String[] args)
	{
		outer o=new outer();
		o.outershow();
	}
}