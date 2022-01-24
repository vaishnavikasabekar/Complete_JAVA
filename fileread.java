import java.io.*;
class fileread
{
	public static void main(String[] argd)throws IOException
	{
		FileInputStream fin=new FileInputStream("a.txt");
		int ch;
		System.out.println("file contents:");
		while((ch=fin.read())!=-1)
		{
			System.out.println((char)ch);
		}
		fin.close();			
	}
}