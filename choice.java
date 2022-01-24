import java.util.*;
class Person
{
	private int id;
	private String nm;
	Person()
	{
        }
	Person(int roll,String nm)
	{
		this.id=id;
		this.nm=nm;
        }
	void show()
	{
		System.out.println("id is:"+id);
		System.out.println("name is:"+nm);
        }
}
class student extends Person
{
	private double fee;
	student()
	{
	}
	student(int id,String nm,double fee)
	{
		super(id,nm);
		this.fee=fee;
	}
	void show()
	{
		super.show();
		System.out.println("fee is:"+fee);
		
        }
}
class teacher extends Person
{
	private double salary;
	teacher()
	{
	}
	teacher(int id,String nm,double salary)
	{
		super(id,nm);
		this.sal=sal;
	}
	void show()
	{
		super.show();
		System.out.println("salary is:"+sal);
		
        }
}
class choice
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int id,ch1,ch2,ch3;
		String nm;
		String nm1;
		Person[]arr=new Person[5];
		int id2;
		int cnt=0, ind=0,size=5;
		double fees,salary;
		while(true)
		{
			System.out.println("\n1 Add student \n2 Display teacher info \n3 Edit Records \4.exit:");
			System.out.println("\nenter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("\n1 Add student \n2 Display student Records \n3 Back:");
					System.out.println("\nenter your choice");
					ch=sc.nextInt();
					switch(ch)
					{
						case 1:
							if(ind<size)
				  			{
								System.out.println("enter id,nm & fee:");
								id=sc.nextInt();
								nm=sc.next();
								fee=sc.nextDouble();
								student s=new student(id,nm,fee);
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
					 
				case 2:
					System.out.println("\n1 Add teacher \n2 Display teacher Records \n3 Back:");
					System.out.println("\enter your choice");
					ch=sc.nextInt();
					switch(ch)
					{
						case 1:
							if(ind<size)
				  			{
								System.out.println("enter id,salary and nm:");
								id=sc.nextInt();
								nm=sc.next();
								sal=sc.nextDouble();
								teacher t=new teacher(id,nm,sal);
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
				case 3:
						System.exit(0);
				default:
						System.out.println("Invalid choice");
				break;




			}
		}
	}
}
					
				  