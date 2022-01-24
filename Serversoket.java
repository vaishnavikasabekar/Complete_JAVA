import java.io.*;
import java.net.*;
class Server
{
	public static void main(String[] args)throws IOException
	{
		Serversoket ss=new Serversoket(777);
		Soket s=ss.accept();
		System.out.println("connections establish");
		OutputStream obj=s.getOutputStream();
		PrintStream ps=new PrintStream(obj);
		String str="HEllO";
		ps.println("str");
		ps.println("bye");
		ps.close();
		s.close();
		ss.close();
	}
}