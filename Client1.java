import java.io.*;
import java.net.*;
class Client
{
	public static void main(String[] args)throws Exception
	{
		Socket s = new Socket("localhost",777);
		InputStream obj1 = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(obj1));
		OutputStream obj2 = s.getOutputStream();
		PrintStream ps = new PrintStream(obj2);
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
 
	
		while(true)
		{
			String str1,str2;
	

			while(!(str1 = kb.readLine()).equals("exit"))
			{
				ps.println(str1);
				str2 = br.readLine();
				System.out.println(str2);
			} 
			ps.close();
			s.close();
			
		}
	}
}