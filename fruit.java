import java.io.*;
class fruit
{
      public static void main(String[] args)throws IOException
      {
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             char ch;
             
             do
             {
                  System.out.println("enter any character:");
                  ch=(char)br.read();
                  br.skip(2);
            
            
                  switch(ch)
                  {
                       case'A':
                            System.out.println("apple");
                            break;
                       case'B':
                            System.out.println("Banana");
                            break;
                       default:
                            System.out.println("invalid choice");
                            break;
                  }
             }
             while(ch!='e');
      }
}