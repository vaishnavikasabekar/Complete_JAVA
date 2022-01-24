import java.util.*;
class Test
{
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            int[] p=new int[5];
            int i;
            System.out.println("enter any array:");
            for(i=0;i<5;i++)
            {
                p[i]=sc.nextInt();
            }
            System.out.println("array elements are:");
            for(i=0;i<5;i++)
            {
               System.out.println("p[i]");
            }
      }
}