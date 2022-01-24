import java.io.*;
class C
{
     public static void main(String[] args)throws IOException
     {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           char ch;
           System.out.println("enter any character:");
           ch=(char)br.read();
           System.out.println("your character is :"+ch);
     }
}