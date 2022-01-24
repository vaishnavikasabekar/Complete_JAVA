class parent
{
	private int x;
	void inputx()
	{
		x=10;
        }
	void showx()
	{
		System.out.println(x);
        }
}
class chlid extends parent
{
	private int y;	
	void inputy()
	{
		y=20;
        }
	void showx()
	{
		System.out.println(y);
        }
}
class gchild extends child
{
	private int z;	
	void inputz()
	{
		z=30;
        }
	void showz()
	{
		System.out.println(z);
        }
}
class inheraDemo1
{
	public static void main(String[] args)
	{
		gchild g=new gchild();
		g.inputx();
		g.inputy();
		g.inputz();
		g.showx();
		g.showy();
		g.showz();
        }
}  