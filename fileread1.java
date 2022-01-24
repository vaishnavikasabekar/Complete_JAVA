import java.io.*;
class fileread1
{
	public static void main(String[] args)throws IOException
	{
		FileReader fr=new FileReader("a.txt");
		BufferedReader br=new BufferedReader(fr);
		int ch;
		while((ch=br.read())!=-1)
		{
			System.out.print((char)ch);
		}
		br.close();
		
	}
}