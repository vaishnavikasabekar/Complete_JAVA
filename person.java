
import java.util.*;
class demo
{
    private int age;
    private String nm;
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age and name:");
        age=sc.nextInt();
        nm=sc.nextLine();
      
    }
    void show()
    {
        System.out.println("my age is:"+age);
        System.out.println("my name is:"+nm);
    } 
    
}
class person
{
     public static void main(String[] args)
     {
          demo d1=new demo();
          demo d2=new demo();
          d1.show();
          d2.show();
          
          
        
         
     }
}