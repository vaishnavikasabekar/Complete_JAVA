import java.util.*;
class power
{
      public static void main(String[] args)
      {
           Scanner sc=new Scanner(System.in);
           int a,b,result=1;
           System.out.println("enter any number:");
           a=sc.nextInt();
           System.out.println("enter power:");
           b=sc.nextInt();
           while(b<=1)
           {
                result=a*result;
                b--;
           }
           System.out.println("power is:"+result);   
      }
}