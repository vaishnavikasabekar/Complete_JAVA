import java.io.*;
class fileread4
{
	public satic void main(String[] args)throws IOException
	{
		FileReader fr=new FileReader("a.txt");
		BufferedReader br=new BufferedReader(fr);
		int ch;
		System.out.println("file contents");
		while((ch=fr.read())!=-1)
		{
			System.out.println((char)ch);
		}
		br.read();
	}
}