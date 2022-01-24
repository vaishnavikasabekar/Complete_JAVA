+import java.util.*;
class parent
{
	private int id;
	private String nm;

	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id & name:");
		id=sc.nextInt();
		nm=sc.nextLine();
	}
	void show()
	{
		System.out.println("your id is:"+id);
		System.out.println("your name is:"+nm);
	}
}
class Student extends parent
{
	private double fees;
	

	void input()
	{
		Scanner sc=new Scanner(System.in);
		super.input();
		System.out.println("enter fees:");
		fees=sc.nextDouble();
		
	}
	void show()
	{
		super.show();
		System.out.println("your fees is:"+fees);
	}	
}
class Teacher extends parent
{
	private double salary;
	

	void input()
	{
		Scanner sc=new Scanner(System.in);
		super.input();
		System.out.println("enter salary:");
		salary=sc.nextDouble();
		
	}
	void show()
	{
		super.show();
		System.out.println("your salary is:"+salary);
	}	
}
class Demo4
{
	public static void main(String[] p)
	{
		Student s=new Student();
		Teacher t=new Teacher();
		s.input();
		s.show();
		t.input();
		t.show();
	}
}



























