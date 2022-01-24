import java.io.*;
class I
{
     public static void main(String[] args)throws IOException
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int a,b,c;
          System.out.println("enter any elements:");
          a=Integer.parseInt(br.readLine());
          b=Integer.parseInt(br.readLine());
          c=a+b;
          System.out.println("addition is:"+c);
     } 
}