import java.io.*;
import java.net.*;
class Server
{
	public static void main(String[] args)throws Exception
	{
		ServerSocket ss= new ServerSocket(777);
		Socket s=ss.accept();
		System.out.println("Connection establish");
		OutputStream obj1 =s.getOutputStream();
		PrintStream ps =new PrintStream(obj1);
		InputStream obj2 =s.getInputStream();
		BufferedReader br =new BufferedReader(new InputStreamReader(obj2));
		BufferedReader kb =new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			String str1,str2;
			while((str1 =br.readLine())!= null)
			{
				System.out.println(str1);
				str2=kb.readLine();
				ps.println("str2");
			}
			ps.close();
			s.close();
			ss.close();
		}
		
	}
}