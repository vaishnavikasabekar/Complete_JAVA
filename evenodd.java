import java.util.*;
class evenodd
{
             public static void main(String[] args)
             {
                  Scanner sc=new Scanner(System.in);
                  int x;
                  System.out.println("enter any number:");
                  x=sc.nextInt();
                  if(x%2==0)
                  {
                     System.out.println("x is even");
                  } 
                  else
                  {
                    System.out.println("x is odd");
                  }
             }
}