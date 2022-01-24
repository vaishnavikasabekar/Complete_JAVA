import java.io.*;
import java.net.*;
class 2-Server
{
	public Static void main(String[] args)throws exception
	{
		ServerSoket ss=new Serversoket(777);
		Server s=ss.accept();
		System.out.println("Connection establish");
		OutputStream obj1=s.getOutputStream();
		PrintStream ps=new PrintStream(obj1);
		InputStream obj2=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(obj2));
		BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			String str1,str2;
			while((str=br.readLine())!=NULL)
			{
				System.out.println(str1);
				str2=kb.readLine();
				ps.println(str2);
			}
			ps.close();
			s.close();
			ss.close();
		}
		
	}
}