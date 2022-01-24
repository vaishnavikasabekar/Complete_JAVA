
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
class child extends parent
{
	private int y;
	void inputy()
	{
   	    y=20;	
        }
	void showy()
	{
	    System.out.println(y);
        }
}
class inheraDemo
{
	public static void main(String[] args)
	{
		child c=new child();
		c.inputx();
		c.inputy();
		c.showx();
		c.showy();
        }
}
