import java.io.*;
import java.net.*;
class client
{
	public static void main(String[] args)throws IOException
	{
		Socket s= new Socket("localhost",777);
		InputStream obj= s.getInputStream();
		BufferedReader br= new BufferedReader(new InputStreamReader(obj));
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		s.close();
	}
}