import java.util.*;
class DemoArray1
{
     public static void main(String[] args)
     {
           Scanner sc=new Scanner(System.in);
           int [] []a=new int [2] [2];
           int i,j;
           System.out.println("enter any array:");
           for(i=0;i<2;i++)
           {
               for(j=0;j<2;j++)
               {
                  a[i][j]=sc.nextInt();
               }
           }
           System.out.println("array elements are:");
           for(i=0;i<2;i++)
           {
               for(j=0;j<2;j++)
               {
                  System.out.println("a[i][j]");
               }
           }
           
     }
}