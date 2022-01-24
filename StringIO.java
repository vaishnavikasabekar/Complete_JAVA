import java.io.*;
class StringIO
{
     public static void main(String[] args)throws IOException
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String str;
          System.out.println("enter any string:");
          str=br.readLine();
          System.out.println("your string is:"+str);
     }
}