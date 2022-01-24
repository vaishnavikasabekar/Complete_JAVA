import java.io.*;
class filewrite2
{
	public static void main(String[] args)throws IOException
	{
		DataInputStream din=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("a.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		char ch;
		System.out.println("enter data @ at the end");
		while((ch=(char)bout.read())!=@)
		{
			bout.write();
		}
		bout.close();
	}
}