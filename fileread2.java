import java.io.*;
class fileread2
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fin=new FileInputStream("a.txt");
		BufferedInputStream br=new BufferedInputStream(fin);
		int ch;
		System.out.println("file contents");
		while((ch=br.read())!=-1)
		{
			System.out.print((char)ch);
		}
		br.close();
	}
}