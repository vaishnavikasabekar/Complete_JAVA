import java.io.*;
import java.net.*;
class Server1
{
	public static void main(String[] args)throws IOException
	{
		ServerSocket ss=new ServerSocket(777);
		Socket s=ss.accept();
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