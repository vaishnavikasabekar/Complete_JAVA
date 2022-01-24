import java.io.*;
import java.util.*;
class salary
{
      public static void main(String[] args)throws IOException
      {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter id,name,salary:");
            String str=br.readLine();
            StringTokenizer st=new StringTokenizer(str," ");
            String s1=st.nextToken();
            String s2=st.nextToken();
            String s3=st.nextToken();

            s1=s1.trim();
            s2=s2.trim();
            s3=s3.trim();

            int id=Integer.parseInt(s1);
            String name=(s2);
            double salary=Double.parseDouble(s3);
            
            System.out.println("id is:"+id);
            System.out.println("name is:"+name);
            System.out.println("salary is:"+salary);

            
      }
}