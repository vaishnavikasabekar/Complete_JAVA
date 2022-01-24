abstract void shape
{
	abstract void area();
}
class circle extends shape
{
	void area()
	{
		System.out.println("Area of circle implemented:");
	}
}
class triangle extends shape
{
	void area()
	{
		System.out.println("Area of triangle implemented:");
	}
}
class Abstract
{
	public static void main(String[] args)
	{
		circle c=new circle();
		c.area();
		triangle t=new triangle();
		t.area();
	}
}