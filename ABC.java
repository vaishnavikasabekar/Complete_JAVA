import java.io.*;
class ABC
{
      public static void main(String[] p)throws IOException
      {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int id;					zz
            char gender;
            String nm;
            System.out.println("enter id:");
            id=Integer.parseInt(br.readLine());
            System.out.println("enter gender:");
            gender=(char) br.read();
            br.skip(2);
            System.out.println("entre name:");
            nm=br.readLine();
            System.out.println(" Id is:"+id);
            System.out.println("Gender is:"+gender);
            System.out.println(" Name is :"+nm);
      }

}