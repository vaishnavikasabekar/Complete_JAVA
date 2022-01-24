import java.util.*;
class calc
{
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            int a,b,c,d,e,f;
            System.out.println("enter any two numbers:");
            a=sc.nextInt(); 
            b=sc.nextInt();
   
            c=a+b;
            d=a-b;
            e=a*b;
            f=a/b; 

            System.out.println("Addition is:"+c);
            System.out.println("substraction is:"+d);
            System.out.println("multiplication is:"+e);
            System.out.println("division is:"+f);
      }
}