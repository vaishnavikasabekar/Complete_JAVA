import java.util.*;
class student
{
	private int roll;
	private String nm;
	student()
	{
		roll=0;
		nm=" ";
        }
	student(int roll,String nm)
	{
		this.roll=roll;
		this.nm=nm;
        }
	void show()
	{
		System.out.println("roll is:"+roll);
		System.out.println("name is:"+nm);
        }
}
class studentDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int roll;
		String nm;
		student[]arr=new student[5];
		int cnt=0, ind=0,size=5;
		int ch;
		while(true)
		{
			System.out.println("\n1 Add student \n2 Display student info \n3 exit:");
			System.out.println("\nenter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
				  if(ind<size)
				  {
					System.out.println("enter roll&nm:");
					roll=sc.nextInt();
					nm=sc.nextLine();
					student s=new student(roll,nm);
					arr[ind]=s;
					ind++;
					cnt++;
			          }
				  else
				  {
					System.out.println("array is full:");
                                  }
				  break;		
				 case 2:
				    if(ind==0)
				    {
					System.out.println("array is empty:");
				    }
			            else
				    {
					for(int i=0;i<cnt;i++)
					{
						arr[i].show();
                                        }
				    }
				    break;	
				   case 3:
					System.exit(0);
				   default:
					System.out.println("Invalid choice:");	
					break;		 


















				    			
				
			}























                }
        }
}