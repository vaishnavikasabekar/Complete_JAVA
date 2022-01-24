abstract class shape
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
class xyz
{
	public static void main(String[] args)
	{
		shape s;
		s=new circle();
		s.area();
		s=new triangle();
		s.area();
	}
}